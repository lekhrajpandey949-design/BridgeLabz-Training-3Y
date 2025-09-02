package javaClass.level1;


public class MobilePhone {
    // Instance variables
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayMobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        MobilePhone mobile1 = new MobilePhone("Vivo", "Vivo V29", 15999);
        MobilePhone mobile2 = new MobilePhone("OnePlus", "Nord 4", 39999);
        MobilePhone mobile3 = new MobilePhone("Apple", "iPhone 16 Pro", 79999);

        mobile1.displayMobile();
        mobile2.displayMobile();
        mobile3.displayMobile();
    }
}

