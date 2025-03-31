package basic;

import basic.StringUtilityMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringMethodTest {

    @Test
    public void testReverseMethod(){
        String reverse = StringUtilityMethod.reverse("aman");
        Assertions.assertEquals("nama", reverse);
    }

    @Test
    public void testUpperCaseMethod(){
        String upperCase = StringUtilityMethod.toUpperCase("aman");
        Assertions.assertEquals("AMAN", upperCase);
    }

    @Test
    public void testIsPalindrome() {
        boolean flag = StringUtilityMethod.isPalindrome("ammbmma");
        Assertions.assertEquals(true, flag);
    }
}
