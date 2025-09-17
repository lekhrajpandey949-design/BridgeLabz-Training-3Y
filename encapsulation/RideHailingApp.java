package encapsulation;
import java.util.ArrayList;
import java.util.List;

/**
 * Ride-Hailing Application
 * Demonstrates Encapsulation, Abstract Classes, Interfaces, and Polymorphism
 */
public class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();

        Vehicle car = new Car("C101", "Amit Sharma", 15.0, "Toyota Etios");
        Vehicle bike = new Bike("B202", "Rahul Verma", 7.0, "Yamaha FZ");
        Vehicle auto = new Auto("A303", "Suresh Kumar", 10.0, "Bajaj RE");

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        // Distance of ride
        double distance = 12.5;

        // Polymorphism: handling different vehicles dynamically
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.printf("Fare for %.2f km = ₹%.2f%n", distance, v.calculateFare(distance));

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("Destination XYZ");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println("------------------------------------");
        }
    }
}

/**
 * GPS Interface
 */
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

/**
 * Abstract Vehicle Class
 */
abstract class Vehicle implements GPS {
    private final String vehicleId;  // immutable
    private String driverName;
    private double ratePerKm;

    // Encapsulated data
    private String currentLocation = "Garage";

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        if (vehicleId == null || vehicleId.isBlank()) {
            throw new IllegalArgumentException("Vehicle ID cannot be blank.");
        }
        this.vehicleId = vehicleId.trim();
        setDriverName(driverName);
        setRatePerKm(ratePerKm);
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Setters with validation
    private void setDriverName(String driverName) {
        if (driverName == null || driverName.isBlank()) {
            throw new IllegalArgumentException("Driver name cannot be blank.");
        }
        this.driverName = driverName.trim();
    }

    private void setRatePerKm(double ratePerKm) {
        if (ratePerKm <= 0) {
            throw new IllegalArgumentException("Rate per km must be positive.");
        }
        this.ratePerKm = ratePerKm;
    }

    // Concrete method
    public void getVehicleDetails() {
        System.out.printf("Vehicle ID: %s | Driver: %s | Rate/km: ₹%.2f%n",
                vehicleId, driverName, ratePerKm);
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // GPS implementation
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

/**
 * Car Class
 */
class Car extends Vehicle {
    private String carModel;

    public Car(String vehicleId, String driverName, double ratePerKm, String carModel) {
        super(vehicleId, driverName, ratePerKm);
        setCarModel(carModel);
    }

    private void setCarModel(String carModel) {
        if (carModel == null || carModel.isBlank()) {
            throw new IllegalArgumentException("Car model cannot be blank.");
        }
        this.carModel = carModel.trim();
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; // Base charge
    }
}

/**
 * Bike Class
 */
class Bike extends Vehicle {
    private String bikeModel;

    public Bike(String vehicleId, String driverName, double ratePerKm, String bikeModel) {
        super(vehicleId, driverName, ratePerKm);
        setBikeModel(bikeModel);
    }

    private void setBikeModel(String bikeModel) {
        if (bikeModel == null || bikeModel.isBlank()) {
            throw new IllegalArgumentException("Bike model cannot be blank.");
        }
        this.bikeModel = bikeModel.trim();
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // No base charge
    }
}

/**
 * Auto Class
 */
class Auto extends Vehicle {
    private String autoType;

    public Auto(String vehicleId, String driverName, double ratePerKm, String autoType) {
        super(vehicleId, driverName, ratePerKm);
        setAutoType(autoType);
    }

    private void setAutoType(String autoType) {
        if (autoType == null || autoType.isBlank()) {
            throw new IllegalArgumentException("Auto type cannot be blank.");
        }
        this.autoType = autoType.trim();
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // Minimum auto charge
    }
}
