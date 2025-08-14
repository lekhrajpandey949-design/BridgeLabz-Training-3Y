package Level2;
import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for a, b, and c
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Perform the integer operations
        int result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;   // Multiplication first, then addition
        int result3 = c + a / b;   // Division (/) first, then addition
        int result4 = a % b + c;   // Modulus (%) first, then addition

        // Print the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        scanner.close();
    }
}
