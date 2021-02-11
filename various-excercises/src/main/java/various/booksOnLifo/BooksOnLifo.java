package various.booksOnLifo;

import java.util.ArrayDeque;
import java.util.Deque;

public class BooksOnLifo {

    Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
    Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
    Book theBook3 = new Book("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);

    Order order1 = new Order(theBook1, 2020, 2, 13);
    Order order2 = new Order(theBook2, 2020, 2, 13);
    Order order3 = new Order(theBook3, 2020, 2, 13);

    Deque<Order> orders = new ArrayDeque<>();

    public void lifoOperations() {

        orders.push(order1);
        orders.push(order2);
        orders.push(order3);

        System.out.println(orders.size());

        Order removingElement;

        removingElement = orders.pop();
        removingElement = orders.pop();
        removingElement = orders.pop();

        System.out.println(orders.size());

        System.out.println("Last removing element is" + removingElement);

    }

    public static void main(String[] args) {
        BooksOnLifo booksOnLifo = new BooksOnLifo();
        booksOnLifo.lifoOperations();
    }
}
