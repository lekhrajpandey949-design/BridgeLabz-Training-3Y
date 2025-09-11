package inheritance;
// OrderTracking.java
class Order {
    int orderId;
    String customerName;

    Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId + ", Customer: " + customerName);
    }
}

class ShippedOrder extends Order {
    String shippingDate;

    ShippedOrder(int orderId, String customerName, String shippingDate) {
        super(orderId, customerName);
        this.shippingDate = shippingDate;
    }

    void displayShippedOrder() {
        displayOrder();
        System.out.println("Shipped on: " + shippingDate);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String customerName, String shippingDate, String deliveryDate) {
        super(orderId, customerName, shippingDate);
        this.deliveryDate = deliveryDate;
    }

    void displayDeliveredOrder() {
        displayShippedOrder();
        System.out.println("Delivered on: " + deliveryDate);
    }
}

public class OrderTracking {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(101, "Rohit Sharma", "2025-09-05", "2025-09-08");
        order.displayDeliveredOrder();
    }
}
