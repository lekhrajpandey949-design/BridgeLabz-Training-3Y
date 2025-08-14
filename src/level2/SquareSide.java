package Level2;
import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        scanner.close();
    }
}
