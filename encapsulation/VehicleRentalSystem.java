package encapsulation;
import java.util.ArrayList;
import java.util.List;

/**
 * Vehicle Rental System
 * Demonstrates Encapsulation, Abstract Classes, Interfaces, and Polymorphism
 */
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("V001", "Car", 2000, "POL123CAR");
        Bike bike = new Bike("V002", "Bike", 500, "POL456BIKE");
        Truck truck = new Truck("V003", "Truck", 3000, "POL789TRUCK");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Polymorphism: iterate over different vehicles using Vehicle reference
        for (Vehicle v : vehicles) {
            v.displayDetails();
            int days = 5;
            System.out.printf("Rental Cost for %d days: %.2f%n", days, v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.printf("Insurance: %.2f%n", ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }
            System.out.println("-------------------------------------------");
        }
    }
}

/**
 * Insurable Interface
 */
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

/**
 * Abstract Class Vehicle
 */
abstract class Vehicle implements Insurable {
    private final String vehicleNumber; // immutable
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber; // sensitive

    public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        if (vehicleNumber == null || vehicleNumber.isBlank()) {
            throw new IllegalArgumentException("Vehicle number cannot be blank");
        }
        this.vehicleNumber = vehicleNumber;
        setType(type);
        setRentalRate(rentalRate);
        setInsurancePolicyNumber(policyNumber);
    }

    // Getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Setters with validation
    public void setType(String type) {
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Type cannot be blank");
        }
        this.type = type.trim();
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate < 0) {
            throw new IllegalArgumentException("Rental rate cannot be negative");
        }
        this.rentalRate = rentalRate;
    }

    // Encapsulation: private access to sensitive insurance data
    private void setInsurancePolicyNumber(String policyNumber) {
        if (policyNumber == null || policyNumber.isBlank()) {
            throw new IllegalArgumentException("Insurance policy number cannot be blank");
        }
        this.insurancePolicyNumber = policyNumber.trim();
    }

    protected String getInsurancePolicyNumber() {
        // protected: subclasses may access, but not directly exposed
        return insurancePolicyNumber;
    }

    // Concrete method
    public void displayDetails() {
        System.out.printf("Vehicle Number: %s%nType: %s%nRental Rate (per day): %.2f%n",
                vehicleNumber, type, rentalRate);
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);
}

/**
 * Car Class
 */
class Car extends Vehicle {
    public Car(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        super(vehicleNumber, type, rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Car rental = daily rate * days (5% discount if rented more than 7 days)
        double cost = getRentalRate() * days;
        if (days > 7) {
            cost *= 0.95;
        }
        return cost;
    }

    @Override
    public double calculateInsurance() {
        // Flat insurance rate for cars = 10% of base rental cost (for 1 day)
        return getRentalRate() * 0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + getInsurancePolicyNumber();
    }
}

/**
 * Bike Class
 */
class Bike extends Vehicle {
    public Bike(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        super(vehicleNumber, type, rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Bike rental = daily rate * days
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        // Insurance = 5% of base rental cost (for 1 day)
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + getInsurancePolicyNumber();
    }
}

/**
 * Truck Class
 */
class Truck extends Vehicle {
    public Truck(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        super(vehicleNumber, type, rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Truck rental = daily rate * days + fixed surcharge
        return (getRentalRate() * days) + 2000;
    }

    @Override
    public double calculateInsurance() {
        // Insurance = 15% of base rental cost (for 1 day)
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + getInsurancePolicyNumber();
    }
}
