package exception;

public class CustomException {

	public static void main(String[] args) {
		
		try
		{
			double balance = 800;
			double minbalance = 1000;
			if(balance < minbalance)
			{
				throw new InvalidBalanceException("balance should be greater than min balance");
			}
			
		}catch(InvalidBalanceException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
class InvalidBalanceException extends Exception
{
	InvalidBalanceException(String msg)
	{
		super(msg);
	}
}
