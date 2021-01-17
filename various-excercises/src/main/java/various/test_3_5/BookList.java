package various.test_3_5;

import java.util.LinkedList;

public class BookList {
    public static void main(String[] args) {

        LinkedList<Book> books = new LinkedList<>();

        for(int p = 0; p < 200000; p++) {
            books.add(new Book("Author nr" + p, "Title nr" + p));
        }

        books.remove(0);
        books.remove(-1);
        books.add(0, new Book("Brian Kowalski", "W pustyni i w paszczy"));
        books.add(199999, new Book("Brainusz Nowak", "Tak było"));


    }
}
