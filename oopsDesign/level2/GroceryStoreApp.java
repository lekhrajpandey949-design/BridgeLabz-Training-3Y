package oopsDesign.level2;
import java.util.*;

// Product Class
class Product {
    private String name;
    private int quantity;
    private double pricePerUnit;

    public Product(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost() {
        return quantity * pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}

// Bill Generator Class
class BillGenerator {
    public double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.getProducts()) {
            total += p.getCost();
        }
        return total;
    }
}

// Main Class
public class GroceryStoreApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        customer.addProduct(new Product("Apples", 2, 3.0));
        customer.addProduct(new Product("Milk", 1, 2.0));

        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.generateBill(customer);

        System.out.println("Customer: " + customer.getName());
        for (Product p : customer.getProducts()) {
            System.out.println(p.getName() + " - " + p.getQuantity() + " units @ $" + p.getPricePerUnit() +
                               " each, Cost = $" + p.getCost());
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}
