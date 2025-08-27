package javamethod.level1;
import java.util.Scanner;

public class q8 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int[] res = findRemainderAndQuotient(number, divisor);
        System.out.println("Remainder = " + res[0] + ", Quotient = " + res[1]);
    }
}
