package controlFlow.level1;

import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        System.out.println("Is the first number the smallest? " + (n1 < n2 && n1 < n3));
    }
}
