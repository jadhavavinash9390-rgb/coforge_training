package Assignment_day_3;

public class BookClass {

    private int bookId;
    private String title;
    private String author;
    private double price;

    public BookClass(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}