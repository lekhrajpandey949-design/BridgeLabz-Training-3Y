package javaClass.level1;


public class HandBook {
    // Instance variables
    String bookTitle;
    String bookAuthor;
    double price;

    // Constructor
    HandBook(String bookTitle, String bookAuthor, double price) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title of Book: " + bookTitle);
        System.out.println("Author of Book: " + bookAuthor);
        System.out.println("Price of Book: " + price);
        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        HandBook book1 = new HandBook("2 States", "Chetan Bhagat", 500);
        HandBook book2 = new HandBook("Wings of Fire", "APJ Abdul Kalam", 700);

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
