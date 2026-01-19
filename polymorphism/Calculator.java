package polymorphism;

public class Calculator {
	void add(int a,int b)
	{
		int sum = a+b;
		System.out.println("Sum : " + sum);
	}
	void add(int a,int b,int c)
	{
		int sum = a+b +c;
		System.out.println("Sum : " +sum);
	}
	void add(double a,double b)
	{
		double sum = a + b ;
		System.out.println("Sum : " +sum);
	}
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		cal.add(3, 4);
		cal.add(3, 4,5);
		cal.add(4.4, 3.3);
	}
	

}
