package basic;

import basic.ParameterTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestParameter {
   @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 12})
    void testEvenNumber(int num){
       Assertions.assertTrue(ParameterTest.isEven(num));
   }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 9, 11})
    void testOddNumber(int num){
        Assertions.assertFalse(ParameterTest.isEven(num));
    }
}
