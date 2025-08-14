package Level2;
import java.util.Scanner;
public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Print the result
        System.out.println("The total purchase price is INR " + totalPrice
                + " if the quantity " + quantity
                + " and unit price is INR " + unitPrice);

        scanner.close();
    }
}
