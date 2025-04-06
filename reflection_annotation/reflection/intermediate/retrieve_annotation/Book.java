package reflection_annotation.reflection.intermediate.retrieve_annotation;

import javax.naming.Name;

@Author(name = "Durjoy Dutta")
public class Book {
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName(String name) {
        return bookName;
    }
}
