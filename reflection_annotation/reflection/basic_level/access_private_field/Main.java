package reflection_annotation.reflection.basic_level.access_private_field;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Aman", 21);
//        Field field = person.getClass().getDeclaredField("age");
//        field.setAccessible(true);
//        field.set(person, 22);
//        System.out.println(person.getAge());
        Constructor cn[] = person.getClass().getDeclaredConstructors();
        for(Constructor c1 : cn){
            System.out.println(c1.getName());
        }
    }
}
