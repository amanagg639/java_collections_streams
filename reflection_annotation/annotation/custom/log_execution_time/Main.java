package reflection_annotation.annotation.custom.log_execution_time;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        ExecutionTime executionTime = new ExecutionTime();
        Class<?> cls = executionTime.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
            if(method.isAnnotationPresent(LogExecutionTime.class)){
                double start = System.currentTimeMillis();
                method.invoke(executionTime);
                double timeTaken = System.currentTimeMillis()-start;
                System.out.println("Time taken for " +  method.getName() + " is " + timeTaken);
            }
        }
    }
}
