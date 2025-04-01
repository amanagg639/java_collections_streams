package reflection_annotation.annotation.custom.mark_improtant;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MethodsLevel methodsLevel = new MethodsLevel();
        Method[] methods = methodsLevel.getClass().getDeclaredMethods();
        for(Method method : methods){
            if(method.isAnnotationPresent(ImportantMethod.class)){
                System.out.println(method.getName());
            }
        }
    }

}
