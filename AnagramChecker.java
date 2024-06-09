package tools;

import java.util.Arrays;

// Class to check if two strings are anagrams
public class AnagramChecker {

  // Method to sort a string alphabetically
  public String sort(String s) {
    // Convert the string to a character array
    char[] chars = s.toCharArray();
    // Sort the character array
    Arrays.sort(chars);
    // Convert the sorted character array back to a string and return it
    return new String(chars);
  }

  // Method to check if two strings are anagrams
  public boolean isAnagrams(String s1, String s2) {
    // Sort the two strings and check if they are equal
    return sort(s1).equals(sort(s2));
  }
  // You can add more methods or functionality as needed
}
