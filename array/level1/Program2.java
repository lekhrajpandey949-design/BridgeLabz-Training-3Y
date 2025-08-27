package array.level1;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        // Input
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        // Check numbers
        for (int num : nums) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last
        if (nums[0] == nums[nums.length - 1]) {
            System.out.println("First and last are equal");
        } else if (nums[0] > nums[nums.length - 1]) {
            System.out.println("First is greater than last");
        } else {
            System.out.println("First is less than last");
        }
    }
}
