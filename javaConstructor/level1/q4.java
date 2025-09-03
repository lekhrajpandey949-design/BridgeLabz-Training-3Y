package javaConstructor.level1;
class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}
public class q4 {
    public static void main(String[] args) {
         System.out.println("\n=== HotelBooking Test ===");
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Virat", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2); // copy constructor
        h1.display();
        h2.display();
        h3.display();
    }
}