package unittesting;

public class UserLoginMain {
	public boolean login(String username,String password)
	{
		if(username.equals("admin") && password.equals("admin123"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
