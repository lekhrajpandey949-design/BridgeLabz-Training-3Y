package string.level2;

import java.util.Scanner;
import java.util.Random;

public class Q9_RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int wins = 0, losses = 0, ties = 0;
        String[] choices = {"Rock", "Paper", "Scissors"};

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter Rock/Paper/Scissors: ");
            String user = sc.next();
            String comp = choices[rand.nextInt(3)];

            System.out.println("Computer chose: " + comp);

            if (user.equalsIgnoreCase(comp)) {
                System.out.println("It's a Tie!");
                ties++;
            } else if ((user.equalsIgnoreCase("Rock") && comp.equals("Scissors")) ||
                       (user.equalsIgnoreCase("Paper") && comp.equals("Rock")) ||
                       (user.equalsIgnoreCase("Scissors") && comp.equals("Paper"))) {
                System.out.println("You Win!");
                wins++;
            } else {
                System.out.println("You Lose!");
                losses++;
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties: " + ties);

        sc.close();
    }
}

