package Inheritance;

public class Bank {
	float interestRate;

}
class SavingAccount extends Bank
{
	float pamount;
	int time;
	float interest;
	
	void calculateInterest()
	{
	interest = (interestRate * pamount * time)/100;
	System.out.println("Interest is " + interest);
	}
	public static void main(String[] args)
	{
		SavingAccount sav = new SavingAccount();
		sav.interestRate = 8;
		sav.pamount = 10000;
		sav.time = 2;
		sav.calculateInterest();
		
	}
}
