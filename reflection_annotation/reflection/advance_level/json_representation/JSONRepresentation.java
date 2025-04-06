package reflection_annotation.reflection.advance_level.json_representation;

import java.lang.reflect.Field;

public class JSONRepresentation {
    public static String convertIntoJSON(Object obj) throws Exception{
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{ ");
        Boolean firstField = true;
        for(Field field : obj.getClass().getDeclaredFields()){
            field.setAccessible(true);
            if(!firstField){
                jsonBuilder.append(", ");
            }
            String key = field.getName();
            Object value = field.get(obj);

            jsonBuilder.append("\"").append(key).append(":\" ");
            jsonBuilder.append("\"").append(value).append("\"");
            firstField = false;
        }
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
