package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExceptionInvalidAge {
ExceptionInvalidAge age = new ExceptionInvalidAge();
	@Test(expected = IllegalArgumentException.class)
	public void test() {
		 age.Age(-9);
		
		
		
	}

}
