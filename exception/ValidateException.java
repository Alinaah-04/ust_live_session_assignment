package exception;
import java.util.*;

public class ValidateException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter age\n");
			int age = sc.nextInt();
			if(age<18)
			{
				throw new InvalidDataException("Age not eligible");
			}
			else
			{
				System.out.println("Age is " + age);
			}
		}
			catch(InvalidDataException e)
			{
				System.out.println(e.getMessage());
			}
		
		

	}

}
class InvalidDataException extends Exception
{
	InvalidDataException(String msg)
	{
		super(msg);
	}
}
