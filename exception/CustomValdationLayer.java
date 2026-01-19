package exception;


public class CustomValdationLayer {
	public static void main(String[] args)
	{
		try
		{
			validate("",5);
		}catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidNameException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void validate(String name,int age) throws InvalidAgeException,InvalidNameException
	{
		if(name.isEmpty())
		{
			throw new InvalidNameException("Name should not be empty");
		}
		if(age<18)
		{
			throw new InvalidAgeException("Age should be greater than 18");
		}
	}

}
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}
class InvalidNameException extends Exception
{
	public InvalidNameException(String msg)
	{
		super(msg);
	}
}