package string.level2;

import java.util.Scanner;

public class Q2_SplitWords {
    static String[] splitWords(String str) {
        str = str + " ";
        int count = 0;
        for (char c : str.toCharArray()) if (c == ' ') count++;
        String[] words = new String[count];
        String temp = "";
        int k = 0;
        for (char c : str.toCharArray()) {
            if (c != ' ') temp += c;
            else {
                words[k++] = temp;
                temp = "";
            }
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words1 = splitWords(text);
        String[] words2 = text.split(" ");

        System.out.println("User-defined split:");
        for (String w : words1) System.out.println(w);

        System.out.println("Built-in split:");
        for (String w : words2) System.out.println(w);

        sc.close();
    }
}

