package string.level2;

import java.util.Scanner;

public class Q6_TabularChars {
    static void showTable(String str) {
        System.out.println("Char | Type");
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) System.out.println(c + "    | Vowel");
            else if (Character.isLetter(c)) System.out.println(c + "    | Consonant");
            else System.out.println(c + "    | Other");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        showTable(text);

        sc.close();
    }
}
