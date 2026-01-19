package encapsulation;

public class Product {
	private double price;
	public double getPrice()
	{
		return this.price;
	}
	public void setPrice(double price)
	{if(price>=100 && price<=100000)
	{
		this.price = price;
	}
	else
	{
		System.out.println("invalid");
	}
	}
	public static void main(String[] args)
	{
		Product p = new Product();
		p.setPrice(9000);
		System.out.println(p.getPrice());
	}

}
