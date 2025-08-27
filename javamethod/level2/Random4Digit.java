package javamethod.level2;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Random4Digit {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 10) {
            int num = 1000 + rand.nextInt(9000); // 1000–9999
            numbers.add(num);
        }

        System.out.println("10 Random 4-digit numbers:");
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
