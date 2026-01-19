package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValdationTest {
EmailValidation emailval = new EmailValidation();
	@Test
	public void test() {
		boolean result = emailval.emailvalidate("alina@gmail.com");
		assertTrue(result);
		
		
	}
	@Test
	public void testfalse()
	{
		boolean result = emailval.emailvalidate("alinagmail.com");
		assertFalse(result)	;	
	}

}
