package oopsDesign.level2;
import java.util.*;

// Subject Class
class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

// Student Class
class Student {
    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}

// Grade Calculator Class
class GradeCalculator {
    public String calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.getSubjects()) {
            total += s.getMarks();
        }
        double avg = (double) total / student.getSubjects().size();

        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 40) return "C";
        else return "F";
    }
}

// Main Class
public class SchoolResultsApp {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student);

        System.out.println("Student: " + student.getName());
        for (Subject s : student.getSubjects()) {
            System.out.println("Subject: " + s.getName() + ", Marks: " + s.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}
