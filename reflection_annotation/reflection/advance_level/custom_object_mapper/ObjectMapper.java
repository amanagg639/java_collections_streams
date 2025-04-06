package reflection_annotation.reflection.advance_level.custom_object_mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception{
        T instance = clazz.getDeclaredConstructor().newInstance();
        for(Field field : clazz.getDeclaredFields()){
            field.setAccessible(true);
            if(properties.containsKey(field.getName())) {
                Object value = properties.get(field.getName());
                field.set(instance, value);
            }
        }
        return instance;
    }
}
