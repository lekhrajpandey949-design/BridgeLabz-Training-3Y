package javaConstructor.level1;
class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
public class q1 {
    public static void main(String[] args) {
        // Book Test
        System.out.println("=== Book Test ===");
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James Gosling", 550.0);
        b1.display();
        b2.display();

    }}