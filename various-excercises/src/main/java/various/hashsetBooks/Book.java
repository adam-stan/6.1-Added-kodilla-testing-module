package various.hashsetBooks;

import java.util.Objects;

public class Book {

    private String name;
    private Integer year;

    public Book(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
