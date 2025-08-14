package Level2;
import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Check for division by zero
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Calculate quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Print the results
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder
                    + " of two numbers " + number1 + " and " + number2);
        }

        scanner.close();
    }

}
