package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlagTestingTest {
FlagTesting flag = new FlagTesting();
	@Test
	public void test() {
		boolean result =flag.existTesting();
		assertTrue(result);
		
	}

}
