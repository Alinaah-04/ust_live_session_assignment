package unittesting;

public class ExceptionInvalidAge {
	public void Age(int age )
	{
		if(age < 0) {
			throw new IllegalArgumentException("age shuld not be negative");
		}
		
	}

}
