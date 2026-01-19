package Inheritance;

public class Vehicle {
	int speed;

}
class Car extends Vehicle
{
	String brand;
	void details()
	{
		System.out.println("Car Brand " + brand);	
	System.out.println("Car Speed " + speed);
	}
	public static void main(String[] args)
	{
		Car car = new Car();
		car.speed = 84;
		car.brand = "BMW";
		car.details();
		
	}
}
