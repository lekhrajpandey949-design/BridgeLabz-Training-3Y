package javaClass.level1;



class Employee {
    // Instance variables
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Employee emp = new Employee("Rohan", 1, 500000);
        emp.displayEmployee();
    }
}

