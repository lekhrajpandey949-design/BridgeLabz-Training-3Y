package javamethod.level1;
import java.util.Scanner;

public class q11 {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] res = calculateTrigonometricFunctions(angle);
        System.out.println("Sine = " + res[0]);
        System.out.println("Cosine = " + res[1]);
        System.out.println("Tangent = " + res[2]);
    }
}
