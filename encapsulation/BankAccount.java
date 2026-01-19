package encapsulation;

public class BankAccount {
	private long accountNumber;
	private double balance = 900;
	public long getAccNum()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setAccNum(long accountNumber)
	{
		this.accountNumber = accountNumber;
		
	}
	public void setBalance(double balance)
	{
		if(balance>=0)
		{
		this.balance = balance;
		}
		else
		{
			System.out.println("invalid");
		}
	}
	public static void main(String[] args)
	{
		BankAccount  bank = new BankAccount();
		bank.setBalance(3000);
		System.out.println("Balance is " + bank.getBalance());
	}

}
