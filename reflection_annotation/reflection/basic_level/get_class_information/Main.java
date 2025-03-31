package reflection_annotation.reflection.basic_level.get_class_information;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        User user = new User("Aman", 21);
        Class<?> cls = user.getClass();
        System.out.println("Class Name: " + cls.getName());
        Constructor[] cns = cls.getConstructors();
        System.out.println("Constructor Name: " + cns[0].getName());
        Field[] fields = cls.getDeclaredFields();
        System.out.println("Fields Name: ");
        for(Field field : fields){
            System.out.println(field.getName());
        }
        Method[] methods = cls.getMethods();
        System.out.println("Methods Name: ");
        for(Method method : methods){
            System.out.println(method.getName());
        }
    }
}
