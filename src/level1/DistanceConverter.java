package Level1;
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Converting feet to yards and miles
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards

        // Displaying the result
        System.out.println(distanceInFeet + " feet is equal to "
                + distanceInYards + " yards and "
                + distanceInMiles + " miles.");

        sc.close();
    }
}
