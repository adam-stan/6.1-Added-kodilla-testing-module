package various.booksOnLifo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    String title;
    String author;
    int year;

}