import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class PalindromeCheckerTests {
    
    @Test
    @DisplayName("isPalindrome returns true for palindrome")
    public void testIsPalindromeReturnsTrueForPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("racecar"));
    }

    @Test
    @DisplayName("isPalindrome returns false for non-palindrome")
    public void testIsPalindromeReturnsFalseForNonPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    @DisplayName("isPalindrome returns false for null")
    public void testIsPalindromeReturnsFalseForNull() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome(null));
    }

    @Test
    @DisplayName("isPalindrome returns false for empty string")
    public void testIsPalindromeReturnsFalseForEmptyString() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome(""));
    }

}
