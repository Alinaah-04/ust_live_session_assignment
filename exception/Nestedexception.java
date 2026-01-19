package exception;

public class Nestedexception {

	public static void main(String[] args) {
		try
		{
			try {
				int a = 3;
				int b =0;
				int div =a/b;
				System.out.println(div);
			}catch(ArithmeticException e)
			{
				System.out.println("Division by zero not allowed");
			}
			String s = null;
			System.out.println(s.length());
		}catch(Exception e)
		{
			System.out.println("General Exception");
		}

	}

}
