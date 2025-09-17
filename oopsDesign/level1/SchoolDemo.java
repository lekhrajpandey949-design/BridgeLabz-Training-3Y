package oopsDesign.level1;
import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String name) { this.name = name; }

    public void enroll(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) { this.name = name; }

    public String getName() { return name; }

    public void enrollInCourse(Course c) {
        courses.add(c);
        c.enroll(this);
    }

    public void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c);
        }
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) { this.name = name; }

    public void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School sch = new School("Delhi Public School");

        Student s1 = new Student("Aman");
        Student s2 = new Student("Riya");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c1);

        c1.showStudents();
        c2.showStudents();
    }
}
