package javamethod.level2;
import java.util.Scanner;

public class StudentVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println(name + " is eligible to vote.");
        } else {
            System.out.println(name + " is NOT eligible to vote.");
        }
    }
}
