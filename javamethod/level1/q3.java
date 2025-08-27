package javamethod.level1;
import java.util.Scanner;

public class q3 {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double s3 = sc.nextDouble();

        System.out.println("Number of rounds to complete 5 km: " + calculateRounds(s1, s2, s3));
    }
}

