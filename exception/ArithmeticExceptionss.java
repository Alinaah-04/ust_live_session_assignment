package exception;

public class ArithmeticExceptionss {

	public static void main(String[] args) {
		try
		{
			int a = 10;
			int b = 0;
			int div = a/b;
			System.out.println(div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not allowed");
		}

	}

}
