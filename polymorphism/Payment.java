package polymorphism;

public class Payment {
	void pay(int amount)
	{
		if(amount> 0)
		{
			System.out.println("Payment successful");
		}
		else
		{
			System.out.println("Payment not successful");
		}
	}
	void pay(int amount,String mode)
	{
		System.out.println("amount to pay : " + amount);
		System.out.println("mode of pay : " + mode);
	}
	public static void main(String[] args)
	{
		 Payment pay = new  Payment();
		 pay.pay(1000);
		 pay.pay(1000,"gpay");
	}

}
