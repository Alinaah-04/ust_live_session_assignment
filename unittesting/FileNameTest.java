package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileNameTest {
TestFileNameExtension file = new TestFileNameExtension();
	@Test
	public void test() {
		boolean result = file.testFileNameExtension("fly.csv");
		assertTrue(result);
		
	}
	@Test
	public void test2()
	{
		boolean result = file.testFileNameExtension("fly.txt");
		assertFalse(result);
	}

}
