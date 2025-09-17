package oopsDesign.level1;
import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
}

class Order {
    private int orderId;
    private List<Product> products = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println(" - " + p.getName() + " : ₹" + p.getPrice());
        }
        System.out.println("Total: ₹" + getTotalAmount());
    }
}

class CustomerEcom {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public CustomerEcom(String name) { this.name = name; }

    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order ID: " + o);
    }

    public void viewOrders() {
        System.out.println("Orders of " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Shoes", 3000);

        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(102);
        order2.addProduct(p3);

        CustomerEcom c1 = new CustomerEcom("Aman");
        c1.placeOrder(order1);
        c1.placeOrder(order2);

        c1.viewOrders();
    }
}
