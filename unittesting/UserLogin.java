package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserLogin {
	UserLoginMain userlogin = new UserLoginMain();
	@Test
	public void testtrue() {
		
		boolean result = userlogin.login("admin","admin123");
		assertTrue(result);
		
		
	}
	@Test
	public void testfalse()
	{
		boolean result = userlogin.login("admin","45678");
		assertFalse(result);
	}

}
