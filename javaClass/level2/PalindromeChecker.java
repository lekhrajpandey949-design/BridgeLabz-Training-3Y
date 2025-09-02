package javaClass.level2;


public class PalindromeChecker {
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    public boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s", "").toLowerCase();
        String reverseText = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reverseText);
    }

    // Display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is Palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        checker2.displayResult();
    }
}
