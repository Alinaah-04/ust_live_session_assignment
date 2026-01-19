package classes;

public class Mobile {
	String brand;
	int ram;
	int storage;
	float price;
	Mobile(String brand,int ram,int storage,float price)
	{
		this.brand = brand;
		this.ram = ram;
		this.storage=storage;
		this.price = price;
	}
	Mobile(String brand,int ram,float price)
	{
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	Mobile(String brand,float price)
	{
		this.brand = brand;
		this.price = price;
	}
	void display()
	{
		System.out.println("Brand is " + brand);
		System.out.println("Ram is " + ram);
		System.out.println("Storage is " + storage);
		System.out.println("price is " + price);
		
	}
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile("Apple",8,2,145000);
		Mobile m2 = new Mobile("vivo",4,45000);
		Mobile m3 = new Mobile("samsung",14500);
		m1.display();
		m2.display();
		m3.display();}

}
