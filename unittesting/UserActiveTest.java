package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserActiveTest {
UserActive user = new UserActive();
	@Test
	public void test() {
		boolean result = user.userActive();
		assertTrue(result);
		
	}

}
