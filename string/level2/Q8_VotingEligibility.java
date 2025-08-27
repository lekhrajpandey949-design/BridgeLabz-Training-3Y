package string.level2;

import java.util.Scanner;

public class Q8_VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter age of student " + i + ": ");
            int age = sc.nextInt();
            if (age >= 18)
                System.out.println("Student " + i + " is Eligible to vote.");
            else
                System.out.println("Student " + i + " is NOT Eligible to vote.");
        }

        sc.close();
    }
}
