package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserNameTest {
UserNameNull user = new UserNameNull();
	@Test
	public void test() {
		String s =user.usernameNull();
		assertNotNull(s);
		
	}

}
