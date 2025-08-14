package Level1;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for two numbers
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;

        // Handling division by zero
        String division;
        if (number2 != 0) {
            division = String.valueOf(number1 / number2);
        } else {
            division = "Undefined (division by zero)";
        }

        // Displaying the results
        System.out.println("The addition, subtraction, multiplication, and division value of "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);

        sc.close();
    }
}
