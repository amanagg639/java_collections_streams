package java_streams;

import java.io.*;

public class ErrorLogFilter {
    public static void main(String[] args) {
        String fileName = "largefile.log";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;

            System.out.println("Lines containing 'error':\n");

            while ((line = reader.readLine()) != null) {
                lineNumber++;

                if (line.toLowerCase().contains("error")) {
                    System.out.println("Line " + lineNumber + ": " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

