public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Alex", "Ryazanov");
        Author author2 = new Author("Svetik" ,"Burkova");
        Book book1 = new Book("джава" , author1, 2021);
        Book book2 = new Book("уроки" , author2 , 2020);
        book1.setYear(2020);
    }
}