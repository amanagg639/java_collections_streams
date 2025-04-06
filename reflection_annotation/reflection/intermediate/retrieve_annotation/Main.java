package reflection_annotation.reflection.intermediate.retrieve_annotation;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("reflection_annotation.reflection.intermediate.retrieve_annotation.Book");
        Author annotation = (Author)cls.getAnnotation(Author.class);
        System.out.println(annotation.name());
    }
}