package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArratListSizeTest {
ArratListSize size = new ArratListSize();
	@Test
	public void test() {
		int n =size.arrayListsize();
		assertEquals(3,n);
		
	}

}
