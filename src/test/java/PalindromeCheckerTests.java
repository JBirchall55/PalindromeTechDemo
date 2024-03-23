import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTests {
    
    @Test
    public void testIsPalindromeReturnsTrueForPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("racecar"));
    }

}
