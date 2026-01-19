package polymorphism;

public class Bank {
	int getinterestRate()
	{
		return 3;
	}
}
	class SBI extends Bank
	{
		int getinterestRate()
		{
			return 7;
		}	
	}
	class HDFC extends Bank
	{
		int getinterestRate()
		{
			return 9;
		}
	
	public static void main(String[] args)
	{
		Bank bank = new Bank();
		Bank sbi = new SBI();
		Bank hdfc = new HDFC();
		int s = sbi.getinterestRate();
		int w = hdfc.getinterestRate();
		System.out.println("interest rate of sbi : " +s);
		System.out.println("interest rate of hdfc :"+w);
		
	}

}
