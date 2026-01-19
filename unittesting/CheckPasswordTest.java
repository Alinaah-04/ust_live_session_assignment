package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPasswordTest {
CheckPassword check = new CheckPassword();
	@Test
	public void test() {
		boolean result = check.checkPassword("12345678");
		assertTrue(result);
	}
	@Test
	public void testFalse()
	{
		boolean result = check.checkPassword("789");
		assertFalse(result);
	}

}
