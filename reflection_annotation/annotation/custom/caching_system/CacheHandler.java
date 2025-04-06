package reflection_annotation.annotation.custom.caching_system;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheHandler {
    private static final Map<String, Object> cache = new HashMap<>();
    public static Object invokeWithCache(Object obj, String methodName, Object... args){
        try {
            StringBuilder keyBuilder = new StringBuilder(methodName);
            for(Object arg : args){
                keyBuilder.append("_").append(arg);
            }
            String key = keyBuilder.toString();
            if(cache.containsKey(key)){
                System.out.println("Returning cached result for " + key);
                return cache.get(key);
            }

            Method method = obj.getClass().getDeclaredMethod(methodName, int.class);

            if(method.isAnnotationPresent(CacheResult.class)){
                Object result = method.invoke(obj, args);
                cache.put(key, result);
                return result;
            } else {
                return method.invoke(obj, args);
            }

        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
