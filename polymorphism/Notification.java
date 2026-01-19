package polymorphism;

public class Notification {
	void send()
	{
		System.out.println("send");
	}

}
class EmailNotification extends Notification
{
	void send()
	{
		System.out.println("email send");
	}
}
class SmsNotification extends Notification
{
	void send()
	{
		System.out.println("sms send");
	}
	public static void main(String[] args)
	{
		Notification email = new EmailNotification();
		Notification sms = new SmsNotification();
		email.send();
		sms.send();
	}
}
