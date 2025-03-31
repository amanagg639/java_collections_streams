package junit.src.test.java.advance;
import advance.DateFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
    @Test
    void testValidDateConversion() {
        assertEquals("31-12-2023", DateFormatter.formatDate("2023-12-31"));
        assertEquals("01-01-2020", DateFormatter.formatDate("2020-01-01"));
        assertEquals("29-02-2024", DateFormatter.formatDate("2024-02-29"));
    }

    @Test
    void testInvalidDateFormats() {

        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("31-12-2023"));
        assertThrows(IllegalArgumentException.class, () -> advance.DateFormatter.formatDate("2023/12/31"));

        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2023-13-01"));

        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate(""));
        assertThrows(NullPointerException.class, () -> DateFormatter.formatDate(null));
    }

}