package inheritance;
// SchoolSystem.java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void display() {
        System.out.println("Teacher: " + name + " | Age: " + age + " | Subject: " + subject);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void display() {
        System.out.println("Student: " + name + " | Age: " + age + " | Grade: " + grade);
    }
}

class Staff extends Person {
    String role;

    Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    void display() {
        System.out.println("Staff: " + name + " | Age: " + age + " | Role: " + role);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Anjali", 35, "Math");
        Student s = new Student("Rahul", 16, 10);
        Staff st = new Staff("Ramesh", 40, "Clerk");

        t.display();
        s.display();
        st.display();
    }
}
