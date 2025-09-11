package keywords;


public class UniversityManagement {
    public static void main(String[] args) {
        // Student Module
        Student.setUniversityName("Global University");
        Student s1 = new Student("Rohit", 101, 'A');
        Student s2 = new Student("Virat", 102, 'B');
        Student.displayTotalStudents();
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        System.out.println("\n--- Library Module ---");
        Book.setLibraryName("Central Library");
        Book b1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        b1.displayBookDetails();

        System.out.println("\n--- Hospital Module ---");
        Patient.setHospitalName("City Hospital");
        Patient p1 = new Patient("Rahul", 30, "P001");
        p1.displayPatientDetails();
        System.out.println("Total Patients: " + Patient.getTotalPatients());

        System.out.println("\n--- Employee Module ---");
        Employee.setCompanyName("Tech Solutions");
        Employee e1 = new Employee("Ankit", 201, "Professor");
        Employee.displayTotalEmployees();
        e1.displayEmployeeDetails();

        System.out.println("\n--- Vehicle Module ---");
        Vehicle.updateRegistrationFee(150.0);
        Vehicle v1 = new Vehicle("Suresh", "Bike", "UP80-AB1234");
        v1.displayVehicleDetails();
    }
}
