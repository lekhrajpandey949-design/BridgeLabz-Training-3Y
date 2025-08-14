package Level2;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        String division;

        // Handle division by zero
        if (number2 != 0) {
            division = String.valueOf(number1 / number2);
        } else {
            division = "Undefined (division by zero)";
        }

        // Print results
        System.out.println("The addition, subtraction, multiplication, and division value of "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        scanner.close();
    }
}
