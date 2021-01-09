package various.average;

import java.util.LinkedList;

public class BookList {
    public static void main(String[] args) {

        various.average.Book book = new various.average.Book("Kaskjhda", 1992);
        various.average.Book book2 = new various.average.Book("sdgsdfg", 2042);
        various.average.Book book3 = new various.average.Book("asdfgf", 1234);
        various.average.Book book4 = new various.average.Book("vdsdv", 2006);
        various.average.Book book5 = new various.average.Book("sdvsdv", 2503);


        LinkedList<various.average.Book> books = new LinkedList<>();

        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);


        for(various.average.Book thebook: books) {
            if (thebook.getYear() > 1999) {
                System.out.println(thebook);
            }
        }
    }
}