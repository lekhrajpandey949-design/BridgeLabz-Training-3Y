package javaConstructor.level1;class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0; // Example rate per day

    // Default Constructor
    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }
}
public class q6 {
    public static void main(String[] args) {
 // CarRental Test
        System.out.println("\n=== CarRental Test ===");
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Lekhraj", "Hyundai i20", 5);
        cr1.display();
        cr2.display();
    }
}