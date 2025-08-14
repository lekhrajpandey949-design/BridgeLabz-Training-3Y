package Level1;
import java.util.Scanner;
public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculating maximum number of handshakes using combination formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying the result
        System.out.println("The maximum number of handshakes among "
                + numberOfStudents + " students is " + maxHandshakes);

        sc.close();
    }
}
