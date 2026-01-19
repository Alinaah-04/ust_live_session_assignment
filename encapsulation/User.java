package encapsulation;

public class User {
	private String email;
	private String password;
	public String getPass()
	{
		return this.password;
	}
	public void setPass(String password)
	{
		if(password.length() >= 8)
		{
			this.password = password;
		}
		else
		{
			System.out.println("invalid");
		}
	}
	public static void main(String[] args)
	{
		User  user = new User();
		user.setPass("12345678");
		System.out.println("Password is " + user.getPass());
	}

}
