package various.test_3_5;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return 31 * (author.hashCode() + title.hashCode());
    }

    @Override
    public boolean equals(Object o) {
    Book e = (Book) o;
    return this.author.equals(e.getAuthor()) && this.title.equals(e.getTitle());
    }
}
