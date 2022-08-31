public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Alex", "Ryazanov");
        Author author2 = new Author("Svetik" ,"Burkova");
        Author author3 = new Author("Alex", "Ryazanov");
        Book book1 = new Book("джава" , author1, 2021);
        Book book2 = new Book("уроки" , author2 , 2020);
        Book book3 = new Book("уроки" , author2 , 2020);
        book1.setYear(2020);
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book2.equals(book3));
    }
}