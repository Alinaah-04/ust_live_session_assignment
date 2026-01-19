package classes;

public class Product {
	int productid;
	String productName;
	float price;
	Product(int productid,String productName,float price){
		this.productid = productid;
		this.productName = productName;
		this.price = price;
		
	}
	void display()
	{
		System.out.println("Product id:"+productid);
		System.out.println("Product Name:"+productName);
		System.out.println("Price:"+price);
		
	}
	public static void main(String[] args)
	{
		Product p = new Product(1,"pen",4);
		p.display();
	}

}
