package java_streams;

import java.io.*;

public class FileCopyPerformance {
    public static void main(String[] args) {
        String sourceFile = "largefile.dat";
        String destBuffered = "buffered_copy.dat";
        String destUnbuffered = "unbuffered_copy.dat";

        // Copy using Buffered Streams
        long startBuffered = System.nanoTime();
        copyWithBufferedStreams(sourceFile, destBuffered);
        long endBuffered = System.nanoTime();
        System.out.println("Buffered Stream Time: " + (endBuffered - startBuffered) / 1_000_000.0 + " ms");

        // Copy using Unbuffered Streams
        long startUnbuffered = System.nanoTime();
        copyWithUnbufferedStreams(sourceFile, destUnbuffered);
        long endUnbuffered = System.nanoTime();
        System.out.println("Unbuffered Stream Time: " + (endUnbuffered - startUnbuffered) / 1_000_000.0 + " ms");
    }

    // Method to copy using Buffered Streams
    private static void copyWithBufferedStreams(String source, String dest) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[4096];  // 4 KB buffer
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to copy using Unbuffered Streams
    private static void copyWithUnbufferedStreams(String source, String dest) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[4096];  // 4 KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

