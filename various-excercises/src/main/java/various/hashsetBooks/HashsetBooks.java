package various.hashsetBooks;

import java.util.HashSet;
import java.util.Set;

public class HashsetBooks {

    Book book = new Book("Book1", 1992);
    Book book2 = new Book("Book2", 2011);
    Book book3 = new Book("Book3", 2019);
    Book book4 = new Book("Book4", 1836);

    Set<Book> books = new HashSet<>();

    public void addBooks() {

        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);

    }

    public void books2010AndYounger () {

        for (Book thebook : books) {
            if(thebook.getYear() > 2010) {
                System.out.println(thebook);
            }
        }
    }

    public static void main(String[] args) {

        HashsetBooks hashsetBooks = new HashsetBooks();
        hashsetBooks.addBooks();
        hashsetBooks.books2010AndYounger();
    }
}
