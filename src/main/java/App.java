import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check if it is a palindrome:");
        String word = input.nextLine();
        System.out.println(PalindromeChecker.isPalindrome(word) ? "It is a palindrome!" : "It is not a palindrome!");

    }

}
