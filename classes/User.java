package classes;

public class User {
	String email;
	String password;
	User(String email)
	{
	this.email = email;	
	}
	User(String email,String password)
	{
	this.email = email;
	this.password = password;
	}
	void display() {
		System.out.println("email "+email);
		System.out.println("password "+password);
		
	}
	public static void main(String[] args)
	{
		User user1 = new User("alina@gmail.com");
		User user2 = new User("alina@gmail.com","123456789");
		user1.display();
		user2.display();
		
	}

}
