package java_streams;

import java.io.*;
import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        String fileName = "textfile.txt";

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {

                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
            sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));


            int totalWords = wordCount.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total words: " + totalWords);

            System.out.println("\nTop 5 most frequent words:");
            for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                Map.Entry<String, Integer> entry = sortedWords.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

