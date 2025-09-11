package inheritance;
// VehicleManagement.java
interface Engine {
    void startEngine();
}

interface Fuel {
    void refuel();
}

class Car implements Engine, Fuel {
    String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println(model + " engine started 🚗");
    }

    @Override
    public void refuel() {
        System.out.println(model + " refueled ⛽");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        Car car = new Car("BMW X5");
        car.startEngine();
        car.refuel();
    }
}
