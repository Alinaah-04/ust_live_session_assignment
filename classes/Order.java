package classes;

public class Order {
	int orderid;
	String customername;
	double amount;
	double tax;
	double taxRate;
	Order(int orderid,String customername,double amount)
	{
		this.orderid = orderid;
		this.customername = customername;
		this.amount = amount;
		this.taxRate = 8.8;
		
		this.tax =(amount * taxRate)/100;
	}
	Order(int orderid,double amount)
	{
		this.orderid = orderid;
		this.amount = amount;
		this.taxRate = 6.7;
		this.tax = (amount * taxRate)/100;
	}
	void calculateTax()
	{
		System.out.println("Customer Name " + customername);
		System.out.println("Order id " + orderid);
		System.out.println("Tax " + tax);
		
	}
public static void main(String[] args)
{
	Order order1 = new Order(101,"Aleesha",79.0);
	Order order2 = new Order(103,78.99);
	//Order order3 = new Order(105,"sachin");
	order1.calculateTax();
	order2.calculateTax();
	
	
}
}
