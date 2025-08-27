package string.level2;

import java.util.Scanner;

public class Q4_ShortestLongest {
    static void findWords(String str) {
        String[] words = str.split(" ");
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (w.length() < shortest.length()) shortest = w;
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        findWords(text);

        sc.close();
    }
}

