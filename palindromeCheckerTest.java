package tools;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
public class PalindromeCheckerTest {
    PalindromeChecker palindromeChecker = new PalindromeChecker();
   
    @Test
    public void testIsPalindrome() {
        // Test cases
        String[] palindromes = {"A man, a plan, a canal, Panama!", "racecar", "12321", "Madam, in Eden, I'm Adam"};
        String[] nonPalindromes = {"hello", "openai", "java", "not a palindrome"};
        
        // Testing palindromes
        for (String palindrome : palindromes) {
            assertTrue(palindromeChecker.isPalindrome(palindrome));
        }
        
        // Testing non-palindromes
        for (String nonPalindrome : nonPalindromes) {
            assertFalse(palindromeChecker.isPalindrome(nonPalindrome));
        }
    }
}
