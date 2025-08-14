package Level2;
import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for a, b, and c as double
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Perform the operations
        double result1 = a + b * c;   // Multiplication first
        double result2 = a * b + c;   // Multiplication first
        double result3 = c + a / b;   // Division first
        double result4 = a % b + c;   // Modulus first

        // Print the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        scanner.close();
    }
}
