package controlFlow.level3;

import java.util.Scanner;

public class SubjectGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int math = sc.nextInt();

        double avg = (phy + chem + math) / 3.0;
        System.out.println("Average Marks = " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A+ | Excellent");
        } else if (avg >= 75) {
            System.out.println("Grade: A | Very Good");
        } else if (avg >= 60) {
            System.out.println("Grade: B | Good");
        } else if (avg >= 50) {
            System.out.println("Grade: C | Average");
        } else {
            System.out.println("Grade: F | Fail");
        }
    }
}
