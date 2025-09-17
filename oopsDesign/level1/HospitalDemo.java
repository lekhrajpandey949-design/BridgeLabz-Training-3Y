package oopsDesign.level1;
import java.util.*;

class Doctor {
    private String name;
    public Doctor(String name) { this.name = name; }

    public void consult(Patient p) {
        System.out.println("Dr. " + name + " is consulting patient " + p.getName());
    }
}

class Patient {
    private String name;
    public Patient(String name) { this.name = name; }
    public String getName() { return name; }
}

class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) { this.name = name; }

    public void addDoctor(Doctor d) { doctors.add(d); }
    public void addPatient(Patient p) { patients.add(p); }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Rajeev");
        Doctor d2 = new Doctor("Sneha");

        Patient p1 = new Patient("Aman");
        Patient p2 = new Patient("Riya");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d2.consult(p2);
    }
}
