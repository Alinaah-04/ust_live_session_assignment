package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeValidationTest {
AgeValidation age = new AgeValidation();
	@Test
	public void testAgebelow18() {
		boolean result = age.validateAge(6);
		assertFalse(result);
		
	}
	@Test
	public void testAgeabove18() {
		boolean result = age.validateAge(40);
		assertTrue(result);
		
	}

}
