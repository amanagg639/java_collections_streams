package reflection_annotation.annotation.custom.todo;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Assignment assignment = new Assignment();
        Class<?> cls = assignment.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
            if(method.isAnnotationPresent(Todo.class)){
                Todo annotation = (Todo)method.getAnnotation(Todo.class);
                System.out.println("Task: " + annotation.task());
                System.out.println("Assigned To: " + annotation.assignedTo());
                System.out.println("Priority: " + annotation.priority());
            }
        }
    }
}
