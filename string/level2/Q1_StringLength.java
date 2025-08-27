package string.level2;

import java.util.Scanner;

public class Q1_StringLength {
    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int len1 = findLength(text);
        int len2 = text.length();

        System.out.println("User-defined length: " + len1);
        System.out.println("Built-in length: " + len2);

        sc.close();
    }
}

