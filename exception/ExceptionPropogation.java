package exception;

public class ExceptionPropogation {

	public static void main(String[] args) {
		try
		{
			divide(10,0);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

	}
	public static void divide(int a,int b)  throws ArithmeticException
	{
		int div = a/b;
		System.out.println(div);
		
}


}

