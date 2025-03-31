package basic;

public class ExceptionHandling {
    public static int divide(int a, int b){
        if(b == 0) throw new ArithmeticException("can not divide by zero");
        return a/b;
    }
}
