package tools;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import org.junit.jupiter.api.Test;

public class LargestPrimeFactorGeneratorTest {

	LargestPrimeFactorGenerator generator = new LargestPrimeFactorGenerator();

	@Test
	public void testGetLargestPrimeFactor() {
		assertEquals(3, generator.getLargestPrimeFactor(6));
		assertEquals(5, generator.getLargestPrimeFactor(15));
	}

}
