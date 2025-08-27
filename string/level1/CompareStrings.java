package string.level1;ram
import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // User-defined comparison
        boolean result1 = compareStrings(str1, str2);

        // Built-in equals()
        boolean result2 = str1.equals(str2);

        System.out.println("Result using charAt() method: " + result1);
        System.out.println("Result using equals() method: " + result2);

        if (result1 == result2) {
            System.out.println("✅ Both results are same!");
        } else {
            System.out.println("❌ Results are different!");
        }
    

