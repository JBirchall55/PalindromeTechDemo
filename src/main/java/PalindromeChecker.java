public class PalindromeChecker {

    static boolean isPalindrome(String word) {
        if(word == null || word.trim().isEmpty()) {
            return false;
        } else {
            return word.toLowerCase().replaceAll("\\s+", "").equals(new StringBuilder(word.toLowerCase().replaceAll("\\s+", "")).reverse().toString());
        }
    }

}
