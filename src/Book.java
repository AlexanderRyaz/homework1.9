import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "[" + this.name + ", " + this.author.toString() + ", " + this.year + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book1 = (Book) obj;
            if (this.year == book1.getYear() && this.author.equals(book1.getAuthor()) && this.name.equals(book1.getName())) {
                return true;
            }

        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.year, this.author);
    }

}
