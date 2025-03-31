package basic;

import basic.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CalculatorTest {
    @Test
    public void testAddition(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(5, 5);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 5);
        Assertions.assertEquals(25, result);
    }
}
