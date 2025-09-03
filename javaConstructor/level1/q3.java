package javaConstructor.level1;
class Person {
    String name;
    int age;

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class q3 {
    public static void main(String[] args) {System.out.println("\n=== Person Test ===");
        Person p1 = new Person("Rohit", 25);
        Person p2 = new Person(p1); // copy constructor
        p1.display();
        p2.display();
    }
}
