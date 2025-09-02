package javaClass.level2;


public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Add items
    public void addItem(int quantityToAdd) {
        this.quantity += quantityToAdd;
        System.out.println("Added " + quantityToAdd + " " + itemName + "(s) to cart.");
    }

    // Remove items
    public void removeItem(int quantityToRemove) {
        if (quantityToRemove > this.quantity) {
            System.out.println("Cannot remove " + quantityToRemove + " " + itemName + "(s). Only " + this.quantity + " left.");
        } else {
            this.quantity -= quantityToRemove;
            System.out.println("Removed " + quantityToRemove + " " + itemName + "(s) from cart.");
        }
    }

    // Total cost
    public double totalCost() {
        return this.price * this.quantity;
    }

    // Display item
    public void displayItem() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 999.99, 1);
        item1.displayItem();

        item1.addItem(2);
        item1.removeItem(1);

        System.out.println("Total cost: $" + item1.totalCost());
    }
}
