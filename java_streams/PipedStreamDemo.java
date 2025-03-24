package java_streams;

import java.io.*;

public class PipedStreamDemo {
    public static void main(String[] args) {
        try {

            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream);


            Thread writerThread = new Thread(new WriterTask(outputStream));

            Thread readerThread = new Thread(new ReaderTask(inputStream));


            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}


class WriterTask implements Runnable {
    private final PipedOutputStream output;

    public WriterTask(PipedOutputStream output) {
        this.output = output;
    }

    @Override
    public void run() {
        try (output) {
            String[] messages = {
                    "Hello from Writer!",
                    "Piped Streams are cool!",
                    "Inter-thread communication in Java",
                    "End of stream"
            };

            for (String msg : messages) {
                output.write((msg + "\n").getBytes());
                System.out.println("Writer: " + msg);
                Thread.sleep(500);  // Simulate processing delay
            }

        } catch (IOException | InterruptedException e) {
            System.out.println("Writer Exception: " + e.getMessage());
        }
    }
}


class ReaderTask implements Runnable {
    private final PipedInputStream input;

    public ReaderTask(PipedInputStream input) {
        this.input = input;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println("Reader: " + line);
            }

        } catch (IOException e) {
            System.out.println("Reader Exception: " + e.getMessage());
        }
    }
}

