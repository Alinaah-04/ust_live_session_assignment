package polymorphism;

public class Area {
	void area(int square)
	{
		float area = square * square;
		System.out.println("area " + area);
	}
	void area(int length,int breadth)
	{
		float area = length * breadth;
		System.out.println("area " + area);
		
	}
	void area(double radius)
	{
		double area = Math.PI * radius *radius;
		System.out.println("area " + area);
		
	}
	public static void main(String[] args)
	{
		Area area = new Area();
		area.area(3);
		area.area(3,4);
		area.area(3.4);
	}

}
