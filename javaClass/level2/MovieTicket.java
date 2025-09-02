package javaClass.level2;



public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Assigned";
        this.price = 0.0;
        this.isBooked = false;
    }

    // Book ticket
    public void bookTicket(String seatNumber, double price) {
        if (isBooked) {
            System.err.println("House Full! Ticket already booked.");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked for movie: " + this.movieName);
            System.out.println("Seat Number: " + this.seatNumber);
            System.out.println("Price: $" + this.price);
        }
    }

    // Display ticket
    public void displayTicket() {
        if (this.isBooked) {
            System.out.println("Movie: " + this.movieName);
            System.out.println("Seat: " + this.seatNumber);
            System.out.println("Price: $" + this.price);
        } else {
            System.out.println("No ticket booked yet...");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Dragon");

        ticket1.displayTicket();
        ticket1.bookTicket("A10", 120.0);
        ticket1.bookTicket("B10", 120.0); // already booked
        ticket1.displayTicket();
    }
}

