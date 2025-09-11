package keywords;


public class Vehicle {
    private static double registrationFee = 100.0;

    private final String registrationNumber;
    private String ownerName;
    private String type;

    public Vehicle(String ownerName, String type, String registrationNumber) {
        this.ownerName = ownerName;
        this.type = type;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double fee) {
        if (fee >= 0) {
            registrationFee = fee;
        }
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + type);
            System.out.println("Reg No: " + registrationNumber);
            System.out.println("Fee: $" + registrationFee);
        }
    }
}
