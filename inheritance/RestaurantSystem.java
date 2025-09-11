package inheritance;
// RestaurantSystem.java
interface Menu {
    void displayMenu();
}

interface Reservation {
    void reserveTable();
}

class Restaurant implements Menu, Reservation {
    String name;

    Restaurant(String name) {
        this.name = name;
    }

    @Override
    public void displayMenu() {
        System.out.println("Menu: Pizza, Burger, Pasta");
    }

    @Override
    public void reserveTable() {
        System.out.println("Table reserved at " + name);
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Restaurant r = new Restaurant("Food Plaza");
        r.displayMenu();
        r.reserveTable();
    }
}
