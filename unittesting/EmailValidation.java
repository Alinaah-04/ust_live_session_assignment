package unittesting;

public class EmailValidation {
	public boolean emailvalidate(String email)
	{
		if(email.contains("@"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
