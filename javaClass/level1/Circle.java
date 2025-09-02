package javaClass.level1;

public class Circle {
    // Instance variable
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public void areaCircle() {
        System.out.printf("Area of Circle: %.4f\n", (Math.PI * radius * radius));
    }

    // Method to calculate circumference
    public void circumferenceCircle() {
        System.out.printf("Circumference of Circle: %.4f\n", (2 * Math.PI * radius));
    }

    // Main method
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        circle.areaCircle();
        circle.circumferenceCircle();
    }
}

