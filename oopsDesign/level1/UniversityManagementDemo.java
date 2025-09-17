package oopsDesign.level1;
import java.util.*;

class CourseU {
    private String courseName;
    private Professor professor;
    private List<StudentU> students = new ArrayList<>();

    public CourseU(String courseName) {
        this.courseName = courseName;
    }

    public void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.getName() + " assigned to " + courseName);
    }

    public void enrollStudent(StudentU s) {
        students.add(s);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "None"));
        System.out.println("Enrolled Students:");
        for (StudentU s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

class StudentU {
    private String name;
    private List<CourseU> courses = new ArrayList<>();

    public StudentU(String name) { this.name = name; }
    public String getName() { return name; }

    public void enrollCourse(CourseU c) {
        courses.add(c);
        c.enrollStudent(this);
        System.out.println(name + " enrolled in " + c);
    }

    public void showCourses() {
        System.out.println(name + " enrolled in courses:");
        for (CourseU c : courses) {
            System.out.println(" - " + c);
        }
    }
}

class Professor {
    private String name;
    public Professor(String name) { this.name = name; }
    public String getName() { return name; }
}

class UniversityU {
    private String uniName;
    private List<StudentU> students = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private List<CourseU> courses = new ArrayList<>();

    public UniversityU(String uniName) { this.uniName = uniName; }

    public void addStudent(StudentU s) { students.add(s); }
    public void addProfessor(Professor p) { professors.add(p); }
    public void addCourse(CourseU c) { courses.add(c); }

    public void showDetails() {
        System.out.println("University: " + uniName);
        System.out.println("Students:");
        for (StudentU s : students) System.out.println(" - " + s.getName());
        System.out.println("Professors:");
        for (Professor p : professors) System.out.println(" - " + p.getName());
        System.out.println("Courses:");
        for (CourseU c : courses) c.showCourseDetails();
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        UniversityU uni = new UniversityU("GLA University");

        StudentU s1 = new StudentU("Rahul");
        StudentU s2 = new StudentU("Priya");

        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Verma");

        CourseU c1 = new CourseU("Data Structures");
        CourseU c2 = new CourseU("Operating Systems");

        c1.assignProfessor(p1);
        c2.assignProfessor(p2);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addProfessor(p2);
        uni.addCourse(c1);
        uni.addCourse(c2);

        uni.showDetails();
    }
}
