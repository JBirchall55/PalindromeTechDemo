import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class PalindromeCheckerTests {
    
    @Test
    @DisplayName("isPalindrome returns true for palindrome")
    public void testIsPalindromeReturnsTrueForPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        Assertions.assertEquals(true, checker.isPalindrome("racecar"));
    }

    @Test
    @DisplayName("isPalindrome returns false for non-palindrome")
    public void testIsPalindromeReturnsFalseForNonPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        Assertions.assertEquals(false, checker.isPalindrome("hello"));
    }

    @Test
    @DisplayName("isPalindrome returns false for null")
    public void testIsPalindromeReturnsFalseForNull() {
        PalindromeChecker checker = new PalindromeChecker();
        Assertions.assertEquals(false, checker.isPalindrome(null));
    }

    @Test
    @DisplayName("isPalindrome returns false for empty string")
    public void testIsPalindromeReturnsFalseForEmptyString() {
        PalindromeChecker checker = new PalindromeChecker();
        Assertions.assertEquals(false, checker.isPalindrome(""));
    }

    @Test
    @DisplayName("isPalindrome returns true for palindrome with spaces")
    public void testIsPalindromeReturnsTrueForPalindromeWithSpaces() {
        PalindromeChecker checker = new PalindromeChecker();
        Assertions.assertEquals(true, checker.isPalindrome("race car"));
    }

    @Test
    @DisplayName("isPalindrome returns false for palindrome with non-alphabetic characters")
    public void testIsPalindromeReturnsFalseForPalindromeWithNonAlphabeticCharacters() {
        PalindromeChecker checker = new PalindromeChecker();
        Assertions.assertEquals(false, checker.isPalindrome("racecar!"));
    }


}
