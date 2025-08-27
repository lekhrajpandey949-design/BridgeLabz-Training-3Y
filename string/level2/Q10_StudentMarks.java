package string.level2;

import java.util.Scanner;

public class Q10_StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int p = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int c = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int m = sc.nextInt();

        int total = p + c + m;
        double percent = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percent + "%");

        if (percent >= 90) System.out.println("Grade: A");
        else if (percent >= 75) System.out.println("Grade: B");
        else if (percent >= 50) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");

        sc.close();
    }
}
