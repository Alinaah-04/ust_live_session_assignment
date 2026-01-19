package exception;

public class ArrayAndArithmetic {

	public static void main(String[] args) {
		try
		{
			int a = 10;
			int b = 0;
			int div = a/b;
			int[] array = {1,3,5};
			System.out.println(div);
			System.out.println(array[9]);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero is not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("invalid index accessed");
		}

	}

}
