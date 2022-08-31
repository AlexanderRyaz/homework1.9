public class Book {
    private String name;
    private Author author;
    private int year;
    public Book (String name, Author author, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }
    public String getName () {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYear () {
        return this.year;
    }
    public void setYear (int year) {
        this.year = year;
    }
}
