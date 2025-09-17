package encapsulation;

import java.util.ArrayList;
import java.util.List;

/**
 * E-Commerce Platform
 * Demonstrates Encapsulation, Abstract Classes, Interfaces, and Polymorphism
 */
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Create Electronics Product
        Electronics laptop = new Electronics("P001", "Laptop", 60000);
        laptop.setWarrantyYears(2);

        // Create Clothing Product
        Clothing tshirt = new Clothing("P002", "T-Shirt", 1000);
        tshirt.setDiscountRate(0.15);

        // Create Groceries Product
        Groceries rice = new Groceries("P003", "Rice Bag", 1200);
        rice.setPerishable(true);

        products.add(laptop);
        products.add(tshirt);
        products.add(rice);

        // Polymorphism: handle all products via Product reference
        for (Product p : products) {
            p.displayProductDetails();
            double finalPrice = calculateFinalPrice(p);
            System.out.printf("Final Price: %.2f%n", finalPrice);
            System.out.println("-------------------------------------------");
        }
    }

    /**
     * Polymorphic method: calculate final price = price + tax - discount
     */
    private static double calculateFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
            System.out.println(((Taxable) product).getTaxDetails());
        }

        return product.getPrice() + tax - discount;
    }
}

/**
 * Taxable Interface
 */
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

/**
 * Abstract Class Product
 */
abstract class Product {
    private final String productId; // immutable
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        if (productId == null || productId.isBlank()) {
            throw new IllegalArgumentException("Product ID cannot be blank");
        }
        this.productId = productId;
        setName(name);
        setPrice(price);
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setters with validation
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        this.name = name.trim();
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    // Concrete method
    public void displayProductDetails() {
        System.out.printf("Product ID: %s%nName: %s%nPrice: %.2f%n",
                productId, name, price);
    }

    // Abstract method
    public abstract double calculateDiscount();
}

/**
 * Electronics Class
 */
class Electronics extends Product implements Taxable {
    private int warrantyYears;

    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    public void setWarrantyYears(int years) {
        if (years < 0) {
            throw new IllegalArgumentException("Warranty cannot be negative");
        }
        this.warrantyYears = years;
    }

    @Override
    public double calculateDiscount() {
        // 10% discount for electronics
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        // 18% GST
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics taxed at 18% GST";
    }
}

/**
 * Clothing Class
 */
class Clothing extends Product {
    private double discountRate; // fraction (0.15 = 15%)

    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
        this.discountRate = 0.05; // default 5%
    }

    public void setDiscountRate(double rate) {
        if (rate < 0 || rate > 1) {
            throw new IllegalArgumentException("Discount rate must be between 0 and 1");
        }
        this.discountRate = rate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }
}

/**
 * Groceries Class
 */
class Groceries extends Product implements Taxable {
    private boolean perishable;

    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public double calculateDiscount() {
        // Perishable groceries → 5% discount
        return perishable ? getPrice() * 0.05 : 0;
    }

    @Override
    public double calculateTax() {
        // 5% GST for groceries
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Groceries taxed at 5% GST";
    }
}
