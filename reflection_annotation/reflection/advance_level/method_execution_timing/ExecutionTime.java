package reflection_annotation.reflection.advance_level.method_execution_timing;

import java.lang.reflect.Method;

public class ExecutionTime {
    public static double findExecutionTime(Object obj, String methodName){
        try {
            Method method = obj.getClass().getDeclaredMethod(methodName);
            double start = System.currentTimeMillis();
            method.invoke(obj);
            return System.currentTimeMillis()-start;
        } catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
}
