package tools;

// Import necessary libraries for testing
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

// Test class for the AnagramChecker class
public class AnagramCheckerTest {

	// Test case for the sort method
	@Test
	public void testSort() {
		// Test if sorting "cab" results in "abc"
		assertEquals("abc", AnagramChecker.sort("cab"));
		// Test if sorting "testing" results in "eginstt"
		assertEquals("eginstt", AnagramChecker.sort("testing"));
	}

	// Test case for the isAnagrams method
	@Test
	public void testIsAnagrams() {
		// Test if "abc" and "cab" are anagrams (expected: true)
		assertEquals(true, AnagramChecker.isAnagrams("abc", "cab"));
		// Test if "thought" and "taught" are anagrams (expected: false)
		assertEquals(false, AnagramChecker.isAnagrams("thought", "taught"));
	}

	// You can add more test cases or methods here

} // End of class