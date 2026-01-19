package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterCountTest {
CharacterCount count = new CharacterCount();
	@Test
	public void test() {
		int len =count.characterCount("god");
		
		assertEquals(3,len);
	}

}
