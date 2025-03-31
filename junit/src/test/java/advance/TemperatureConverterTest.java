package junit.src.test.java.advance;
import advance.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
        assertEquals(68, TemperatureConverter.celsiusToFahrenheit(20), 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
        assertEquals(20, TemperatureConverter.fahrenheitToCelsius(68), 0.001);
    }
}