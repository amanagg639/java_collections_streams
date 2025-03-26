package regex_junit.regex.advanced_problems;

import java.util.*;
import java.util.regex.*;

public class RepeatingWords {
    public static void main(String[] args) {
        String sentence = "This is is a repeated repeated word test.";

        findRepeatingWords(sentence);
    }

    public static void findRepeatingWords(String sentence) {
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        Set<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }

        if (repeatedWords.isEmpty()) {
            System.out.println("No repeating words found.");
        } else {
            System.out.println(String.join(", ", repeatedWords));
        }
    }
}

