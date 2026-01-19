package unittesting;

public class CheckPassword {
	public boolean checkPassword(String password)
	{
		if(password.length()>=8)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
