public class PalindromeChecker {

    static boolean isPalindrome(String word) {
        if(word == null) {
            return false;
        } else {
            return word.toLowerCase().equals(new StringBuilder(word.toLowerCase()).reverse().toString());
        }
    }

}
