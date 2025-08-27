package string.level2;

import java.util.Scanner;

public class Q3_SplitWordsWithLength {
    static String[][] splitWithLength(String str) {
        String[] words = str.split(" ");
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] ans = splitWithLength(text);

        System.out.println("Word  | Length");
        for (String[] row : ans) {
            System.out.println(row[0] + "  | " + row[1]);
        }

        sc.close();
    }
}

