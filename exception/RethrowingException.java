package exception;

public class RethrowingException {

	public static void main(String[] args) {
		try
		{
			divide(10,0);
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}

	}
	public static void divide(int a,int b) throws ArithmeticException
	{
		try {
		int div = a/b;
		System.out.println("div");
	}catch(ArithmeticException e)
		{
		System.out.println(e.getMessage());
		throw e;
		}

}
}
