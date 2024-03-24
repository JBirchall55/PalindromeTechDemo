import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeCheckerTests {
    
    @ParameterizedTest
    @DisplayName("isPalindrome returns true for palindromes")
    @ValueSource(strings = {"racecar", "radar", "level", "rotor", "madam", "refer", "deified", "civic", "reviver", "rotator", "repaper", "detartrated", "redivider", "aibohphobia"})
    public void testIsPalindromeReturnsTrueForPalindromes() {
        PalindromeChecker checker = new PalindromeChecker();
        Assertions.assertEquals(true, checker.isPalindrome("racecar"));
    }

    @ParameterizedTest
    @DisplayName("isPalindrome returns false for non-palindromes")
    @ValueSource(strings = {"hello", "world", "java", "programming", "is", "fun"})
    public void testIsPalindromeReturnsFalseForNonPalindromes() {
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
