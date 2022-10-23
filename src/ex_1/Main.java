package ex_1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Hello World", new Author("Armen", "armpiloyan53@gmail.com", 'm'), 1500, 15);
        System.out.println(book.toString());
    }
}