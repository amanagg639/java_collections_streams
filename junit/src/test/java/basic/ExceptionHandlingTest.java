package basic;

import basic.ExceptionHandling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
    @Test
    public void testDivisionException(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            int result = ExceptionHandling.divide(10, 0);
        });

    }
    @Test
    public void testDivision(){
        Assertions.assertEquals(5, ExceptionHandling.divide(25, 5));
    }
}
