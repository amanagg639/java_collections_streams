package reflection_annotation.annotation.custom.json_serialization;

import java.lang.reflect.Field;

public class JsonSerializer {
    public static String toJson(Object obj){
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");
        boolean firstField = true;
        Field[] fields = obj.getClass().getDeclaredFields();
        for(Field field : fields){
            JsonField jsonField = field.getAnnotation(JsonField.class);
            if(jsonField != null){
                field.setAccessible(true);
                try {
                    if(!firstField){
                        jsonBuilder.append(", ");
                    }
                    String key = jsonField.name();
                    Object value = field.get(obj);
                    jsonBuilder.append("\"").append(key).append("\": ");
                    jsonBuilder.append("\"").append(value).append("\"");
                    firstField = false;
                } catch (IllegalAccessException e){
                    e.printStackTrace();
                }
            }
        }
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
