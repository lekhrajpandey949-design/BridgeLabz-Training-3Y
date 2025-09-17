
package encapsulation;
import java.util.ArrayList;
import java.util.List;

/**
 * Employee Management System
 * Demonstrates Encapsulation, Abstract Classes, Interfaces, and Polymorphism
 */
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Create Full-Time Employee
        FullTimeEmployee ft = new FullTimeEmployee("E001", "Aman Sharma", 50000);
        ft.assignDepartment("Engineering");

        // Create Part-Time Employee
        PartTimeEmployee pt = new PartTimeEmployee("E002", "Ravi Kumar", 0);
        pt.setHoursWorked(80);
        pt.setHourlyRate(500);
        pt.assignDepartment("Support");

        employees.add(ft);
        employees.add(pt);

        // Polymorphism: Process employees using Employee reference
        for (Employee e : employees) {
            e.displayDetails();
            System.out.printf("Salary: %.2f%n", e.calculateSalary());
            System.out.println(e.getDepartmentDetails());
            System.out.println("-------------------------------------------");
        }
    }
}

/**
 * Department Interface
 */
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

/**
 * Abstract Class Employee
 */
abstract class Employee implements Department {
    private final String employeeId; // immutable
    private String name;
    private double baseSalary;
    private String department;

    public Employee(String employeeId, String name, double baseSalary) {
        if (employeeId == null || employeeId.isBlank()) {
            throw new IllegalArgumentException("Employee ID cannot be blank");
        }
        this.employeeId = employeeId;
        setName(name);
        setBaseSalary(baseSalary);
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Setters with validation
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        this.name = name.trim();
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    // Department Interface Implementation
    @Override
    public void assignDepartment(String departmentName) {
        if (departmentName == null || departmentName.isBlank()) {
            throw new IllegalArgumentException("Department cannot be blank");
        }
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + (department == null ? "Not Assigned" : department);
    }

    // Concrete method
    public void displayDetails() {
        System.out.printf("Employee ID: %s%nName: %s%nBase Salary: %.2f%n",
                employeeId, name, baseSalary);
    }

    // Abstract method
    public abstract double calculateSalary();
}

/**
 * Full-Time Employee Class
 */
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // Full-time salary = fixed base salary
        return getBaseSalary();
    }
}

/**
 * Part-Time Employee Class
 */
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative");
        }
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative");
        }
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        // Part-time salary = hours worked * hourly rate
        return hoursWorked * hourlyRate;
    }
}
