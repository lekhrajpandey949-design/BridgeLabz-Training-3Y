package javaConstructor.level1;
class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
}
public class q5 {
    public static void main(String[] args) {
         System.out.println("\n=== LibraryBook Test ===");
        LibraryBook lb1 = new LibraryBook("Data Structures", "Mark Allen", 450.0, true);
        lb1.display();
        lb1.borrowBook();
        lb1.borrowBook();
    }
}