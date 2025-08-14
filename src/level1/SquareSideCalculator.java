package Level1;
import java.util.Scanner;
public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculating the side of the square
        double side = perimeter / 4;

        // Displaying the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }
}
