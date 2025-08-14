package Level2;
import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Print the results
        System.out.println("The distance in yards is " + distanceInYards
                + " while the distance in miles is " + distanceInMiles);

        scanner.close();
    }
}
