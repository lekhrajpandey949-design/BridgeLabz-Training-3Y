package keywords;


public class Patient {
    private static String hospitalName;
    private static int totalPatients = 0;

    private final String patientID;
    private String name;
    private int age;

    public Patient(String name, int age, String patientID) {
        this.name = name;
        this.age = age;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}
