package controlFlow.level2;
import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int num = sc.nextInt();

        if (num > 0 && num < 100) {
            System.out.println("Multiples of " + num + " below 100:");
            int counter = 100;
            while (counter >= 1) {
                if (counter % num == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
