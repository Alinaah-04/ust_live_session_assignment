package polymorphism;

public class Login {
	void login(String email)
	{
		System.out.println("email is " + email);
	}
	void login(String email,String password)
	{
		System.out.println("email is " + email);
		System.out.println("password is " + password);
		
	}
	public static void main(String[] args)
	{
		Login log = new Login();
		log.login("alinaannjoseph@gmail.com");
		log.login("alinaannjoseph@gmail.com","123456789");
	}
	

}
