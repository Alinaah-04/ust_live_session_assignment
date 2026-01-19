package classes;

public class Car {
	String brand;
	String model;
	float price;
	Car(String brand,String model,float price)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
		
	}
	void displayDetails()
	{
		System.out.println("Brand :"+ brand);
		System.out.println("Model :"+ model);
		
		System.out.println("Price :"+ price);
		
		
	}
	public static void main(String[] args)
	{
		Car c1 = new Car("Bmw","2030",1000000);
		Car c2 = new Car("Thar","2025",1700000);
		c1.displayDetails();
		c2.displayDetails();
		
	}

}
