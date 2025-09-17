package encapsulation;
import java.util.ArrayList;
import java.util.List;

/**
 * Online Food Delivery System
 * Demonstrates Encapsulation, Abstract Classes, Interfaces, and Polymorphism
 */
public class FoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem v1 = new VegItem("Paneer Butter Masala", 250, 2);
        NonVegItem n1 = new NonVegItem("Chicken Biryani", 300, 1);
        VegItem v2 = new VegItem("Veg Burger", 120, 3);

        order.add(v1);
        order.add(n1);
        order.add(v2);

        // Polymorphism: process all food items through FoodItem reference
        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                double discounted = d.applyDiscount(total);
                System.out.printf("Final Price after Discount: %.2f%n", discounted);
                System.out.println("Discount Details: " + d.getDiscountDetails());
            }
            System.out.println("-----------------------------------");
        }
    }
}

/**
 * Discountable Interface
 */
interface Discountable {
    double applyDiscount(double totalPrice);
    String getDiscountDetails();
}

/**
 * Abstract FoodItem Class
 */
abstract class FoodItem implements Discountable {
    private final String itemName; // immutable
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        if (itemName == null || itemName.isBlank()) {
            throw new IllegalArgumentException("Item name cannot be blank.");
        }
        this.itemName = itemName.trim();
        setPrice(price);
        setQuantity(quantity);
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters with validation
    private void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
        this.price = price;
    }

    private void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be at least 1.");
        }
        this.quantity = quantity;
    }

    // Concrete Method
    public void getItemDetails() {
        System.out.printf("Item: %s | Price: %.2f | Quantity: %d%n",
                itemName, price, quantity);
    }

    // Abstract Method
    public abstract double calculateTotalPrice();

    // Default discount (can be overridden)
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice; // no discount by default
    }

    @Override
    public String getDiscountDetails() {
        return "No discount available.";
    }
}

/**
 * VegItem Class
 */
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double totalPrice) {
        // 5% discount for Veg items
        return totalPrice * 0.95;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied on Veg Item.";
    }
}

/**
 * NonVegItem Class
 */
class NonVegItem extends FoodItem {
    private static final double NONVEG_CHARGE = 50; // extra per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NONVEG_CHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount(double totalPrice) {
        // 10% discount for Non-Veg items
        return totalPrice * 0.90;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Non-Veg Item.";
    }
}
