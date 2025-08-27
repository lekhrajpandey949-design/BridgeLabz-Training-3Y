package string.level2;

import java.util.Scanner;

public class Q7_TrimSpaces {
    static String customTrim(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return str.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        System.out.println("Custom Trim: '" + customTrim(text) + "'");
        System.out.println("Built-in Trim: '" + text.trim() + "'");

        sc.close();
    }
}

