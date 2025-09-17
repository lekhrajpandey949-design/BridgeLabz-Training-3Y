package encapsulation;
import java.util.ArrayList;
import java.util.List;

/**
 * Library Management System
 * Demonstrates Encapsulation, Abstract Classes, Interfaces, and Polymorphism
 */
public class LibrarySystem {
    public static void main(String[] args) {
        List<LibraryItem> library = new ArrayList<>();

        Book b1 = new Book("B001", "Clean Code", "Robert C. Martin");
        Magazine m1 = new Magazine("M001", "National Geographic", "Various Authors");
        DVD d1 = new DVD("D001", "Inception", "Christopher Nolan");

        library.add(b1);
        library.add(m1);
        library.add(d1);

        // Borrowers
        b1.reserveItem("Amit Sharma");
        m1.reserveItem("Sneha Verma");

        // Polymorphism: process all items via LibraryItem reference
        for (LibraryItem item : library) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Availability: " + (r.checkAvailability() ? "Available" : "Reserved"));
            }
            System.out.println("-------------------------------------");
        }
    }
}

/**
 * Reservable Interface
 */
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

/**
 * Abstract LibraryItem Class
 */
abstract class LibraryItem implements Reservable {
    private final String itemId; // immutable
    private final String title;
    private final String author;

    // sensitive info
    private String borrowerName;
    private boolean reserved;

    public LibraryItem(String itemId, String title, String author) {
        if (itemId == null || itemId.isBlank()) {
            throw new IllegalArgumentException("Item ID cannot be blank.");
        }
        this.itemId = itemId.trim();
        this.title = title;
        this.author = author;
        this.reserved = false;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected String getBorrowerName() {
        return borrowerName;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    protected boolean isReserved() {
        return reserved;
    }

    protected void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    // Concrete Method
    public void getItemDetails() {
        System.out.printf("Item ID: %s | Title: %s | Author: %s%n", itemId, title, author);
        if (reserved) {
            System.out.println("Currently reserved by: " + borrowerName);
        } else {
            System.out.println("Currently available.");
        }
    }

    // Abstract Method
    public abstract int getLoanDuration();

    // Reservable Implementation
    @Override
    public void reserveItem(String borrowerName) {
        if (reserved) {
            System.out.println(title + " is already reserved by " + this.borrowerName);
        } else {
            setReserved(true);
            setBorrowerName(borrowerName);
            System.out.println(title + " reserved successfully by " + borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

/**
 * Book Class
 */
class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }
}

/**
 * Magazine Class
 */
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }
}

/**
 * DVD Class
 */
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }
}
