package java_streams;

import java.io.*;
import java.util.Arrays;

public class ImageByteArrayConverter {
    public static void main(String[] args) {
        String sourceImage = "input.jpg";
        String destinationImage = "output.jpg";

        try {

            byte[] imageBytes = imageToByteArray(sourceImage);

            byteArrayToImage(imageBytes, destinationImage);

            System.out.println("Image conversion completed successfully!");

            if (Arrays.equals(imageBytes, imageToByteArray(destinationImage))) {
                System.out.println("Verification: The new image is identical to the original.");
            } else {
                System.out.println("Verification: The new image is different from the original.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to convert image file to byte array
    private static byte[] imageToByteArray(String filePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

    // Method to write byte array back to image file
    private static void byteArrayToImage(byte[] imageBytes, String outputFilePath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
