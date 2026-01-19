package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUpperCaseTest {
StringUpperCase upper = new StringUpperCase();
	@Test
	public void test() {
		String s = upper.Uppercase("god");
		assertEquals("GOD",s);
		
	}

}
