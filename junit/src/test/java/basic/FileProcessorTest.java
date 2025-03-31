package basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {
    private static final String TEST_FILE = "D:\\bridgelabz-workspace\\java-collections-streams\\src\\exception_handling\\checked_exception\\data.txt";

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        FileProcessor.writeToFile(TEST_FILE, content);

        String result = FileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, result, "File content should match");
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Sample Data");
        assertTrue(Files.exists(Path.of(TEST_FILE)), "File should exist after writing");
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE));
    }
}