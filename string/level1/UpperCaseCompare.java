package string.level1;

import java.util.Scanner;

public class UpperCaseCompare {
    public static String toUpperManual(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();

        String upper1 = toUpperManual(str);
        String upper2 = str.toUpperCase();

        System.out.println("Manual Uppercase: " + upper1);
        System.out.println("Built-in Uppercase: " + upper2);
        System.out.println("Comparison result: " + compareStrings(upper1, upper2));
    }
}

