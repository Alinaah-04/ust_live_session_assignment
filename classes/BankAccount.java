package classes;

public class BankAccount {
	long accnumber;
	String holdername;
	double balance;
	BankAccount(long accnumber,String holdername,double balance)
	{
		this.accnumber = accnumber;
		this.holdername = holdername;
		this.balance = balance;
	}
	void showAccount()
	{
		System.out.println("Account Number :"+ accnumber);
		System.out.println("Account Holder :"+ holdername);
		System.out.println("Account Balance :"+ balance);
	}
	public static void main(String[] args)
	{
		BankAccount b1 = new BankAccount(4567895432L,"God",567845);
		b1.showAccount();
		
	}
	

}
