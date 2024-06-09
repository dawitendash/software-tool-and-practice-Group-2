package tools;

import static org.junit.Assert.assertEquals;
<<<<<<< HEAD
import org.junit.Test;



public class GradeCalculatorTest {

    @Test//testing 
    public void testGetGrade() {
        assertEquals("A", GradeCalculator.getGrade(88));
        assertEquals("B-", GradeCalculator.getGrade(69.5));
        assertEquals("C", GradeCalculator.getGrade(57));
        assertEquals("F", GradeCalculator.getGrade(0));
        assertEquals("Invalid mark!!", GradeCalculator.getGrade(-1));
    }
=======

import org.junit.Test;

public class GradeCalculatorTest {

  @Test // Indicates that this method is a test case
  public void testGetGrade() {
    // Test cases to check the correctness of the getGrade method

    // Test if the grade for a mark of 88 is "A"
    assertEquals("A", GradeCalculator.getGrade(88));

    // Test if the grade for a mark of 69.5 is "B-"
    assertEquals("B-", GradeCalculator.getGrade(69.5));

    // Test if the grade for a mark of 57 is "C"
    assertEquals("C", GradeCalculator.getGrade(57));

    // Test if the grade for a mark of 0 is "F"
    assertEquals("F", GradeCalculator.getGrade(0));

    // Test if the grade for an invalid negative mark is "Invalid mark!!"
    assertEquals("Invalid mark!!", GradeCalculator.getGrade(-1));
  }
>>>>>>> d941113f32ce098ba639a45204c2352c003b332b
}
