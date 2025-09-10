import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "John Doe")
class Book {}

public class RetrieveAnnotations {
    public static void main(String[] args) {
        Class<Book> clazz = Book.class;
        if (clazz.isAnnotationPresent(Author.class)) {
            Author a = clazz.getAnnotation(Author.class);
            System.out.println("Author: " + a.name());
        }
    }
}