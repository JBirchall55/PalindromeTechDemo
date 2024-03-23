public class PalindromeChecker {

    private boolean isPalindrome(String word) {
        if(word == null) {
            return false;
        } else {
            return word.equals(new StringBuilder(word).reverse().toString());
        }
    }

}
