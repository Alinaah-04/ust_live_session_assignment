package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefaultValueTest {
DefaultValue value = new DefaultValue();
	@Test
	public void test() {
		String s =value.defaultValue();
		assertEquals("IN",s);
	}

}
