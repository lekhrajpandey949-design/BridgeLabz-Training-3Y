package inheritance;
// SmartHome.java
class Device {
    String deviceId;
    boolean status;

    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Device: " + deviceId + " | Status: " + (status ? "On" : "Off"));
        System.out.println("Temperature: " + temperatureSetting + "°C");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH-101", true, 24);
        t1.displayStatus();
    }
}

