package java_streams;

import java.io.*;

public class UpperToLowerConverter {
    public static void main(String[] args) {
        String sourceFile = "input.txt";    // Source file
        String destinationFile = "output.txt";  // Destination file

        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Convert line to lowercase and write to destination
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File conversion completed successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

