package reflection_annotation.reflection.basic_level.invoke_private_method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception{
        Calculator operation = new Calculator();
        Class<?> cls = operation.getClass();
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        int ans = (int)method.invoke(operation, 4, 5);
        System.out.println("Result: " + ans);
    }

}
