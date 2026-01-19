package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayContainTest {
ArrayContain contain =new ArrayContain();
	@Test
	public void test() {
		boolean result = contain.arrayContain();
		assertTrue(result);
		
	}

}
