package oopsDesign.level1;
import java.util.*;

class Faculty {
    private String name;
    public Faculty(String name) { this.name = name; }
    public String getName() { return name; }
}

class DepartmentU {
    private String deptName;
    public DepartmentU(String deptName) { this.deptName = deptName; }
    public String getDeptName() { return deptName; }
}

class University {
    private String name;
    private List<DepartmentU> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) { this.name = name; }

    public void addDepartment(DepartmentU d) { departments.add(d); }
    public void addFaculty(Faculty f) { faculties.add(f); }

    public void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (DepartmentU d : departments) System.out.println(" - " + d.getDeptName());
        System.out.println("Faculties:");
        for (Faculty f : faculties) System.out.println(" - " + f.getName());
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("GLA University");

        uni.addDepartment(new DepartmentU("CSE"));
        uni.addDepartment(new DepartmentU("ECE"));

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Verma");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDetails();
    }
}
