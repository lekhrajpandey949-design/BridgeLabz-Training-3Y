package string.level1;

import java.util.Scanner;

public class LowerCaseCompare {
    public static String toLowerManual(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
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

        String lower1 = toLowerManual(str);
        String lower2 = str.toLowerCase();

        System.out.println("Manual Lowercase: " + lower1);
        System.out.println("Built-in Lowercase: " + lower2);
        System.out.println("Comparison result: " + compareStrings(lower1, lower2));
    }
}
