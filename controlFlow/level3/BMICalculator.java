package controlFlow.level3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Status: Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}
