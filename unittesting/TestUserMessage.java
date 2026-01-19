package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUserMessage {
UserMessage msg = new UserMessage();
	@Test
	public void test() {
		String message = msg.userMessage("god");
		assertEquals("Welcome,god",message);
	}

}
