package encapsulation;
import java.util.ArrayList;
import java.util.List;

/**
 * Hospital Patient Management System
 * Demonstrates Encapsulation, Abstract Classes, Interfaces, and Polymorphism
 */
public class HospitalSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient("P001", "Rohit Sharma", 35, 5, 2000);
        OutPatient p2 = new OutPatient("P002", "Virat Kohli", 36, 500);

        patients.add(p1);
        patients.add(p2);

        // Adding medical records
        p1.addRecord("Admitted for Surgery");
        p1.addRecord("Recovery progressing well");
        p2.addRecord("Routine checkup - Healthy");

        // Polymorphism: process patients via Patient reference
        for (Patient pat : patients) {
            pat.getPatientDetails();
            System.out.printf("Bill Amount: %.2f%n", pat.calculateBill());

            if (pat instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) pat;
                System.out.println("Medical Records: " + record.viewRecords());
            }
            System.out.println("-----------------------------------");
        }
    }
}

/**
 * MedicalRecord Interface
 */
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

/**
 * Abstract Patient Class
 */
abstract class Patient implements MedicalRecord {
    private final String patientId; // immutable
    private String name;
    private int age;

    // Sensitive data
    private final List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age) {
        if (patientId == null || patientId.isBlank()) {
            throw new IllegalArgumentException("Patient ID cannot be blank.");
        }
        this.patientId = patientId.trim();
        setName(name);
        setAge(age);
    }

    // Getters
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters with validation
    private void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        this.name = name.trim();
    }

    private void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Invalid age.");
        }
        this.age = age;
    }

    // Concrete Method
    public void getPatientDetails() {
        System.out.printf("Patient ID: %s | Name: %s | Age: %d%n", patientId, name, age);
    }

    // Abstract Method
    public abstract double calculateBill();

    // MedicalRecord Implementation
    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return new ArrayList<>(medicalHistory); // return copy for security
    }
}

/**
 * InPatient Class
 */
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        setDaysAdmitted(daysAdmitted);
        setDailyRate(dailyRate);
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    private void setDaysAdmitted(int daysAdmitted) {
        if (daysAdmitted <= 0) {
            throw new IllegalArgumentException("Days admitted must be greater than 0.");
        }
        this.daysAdmitted = daysAdmitted;
    }

    private void setDailyRate(double dailyRate) {
        if (dailyRate <= 0) {
            throw new IllegalArgumentException("Daily rate must be greater than 0.");
        }
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }
}

/**
 * OutPatient Class
 */
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        setConsultationFee(consultationFee);
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    private void setConsultationFee(double consultationFee) {
        if (consultationFee <= 0) {
            throw new IllegalArgumentException("Consultation fee must be greater than 0.");
        }
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}
