package javaConstructor.level1;
class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Circle radius: " + radius);
    }
}
public class q2 {
    public static void main(String[] args) {
        // Book Test
         System.out.println("\n=== Circle Test ===");
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        c1.display();
        c2.display();
}
}

