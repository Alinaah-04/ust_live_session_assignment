package polymorphism;

public class Shape {
	void draw()
	{
		System.out.println("Drwaing shapes");
	}
}
	class Circle extends Shape
	{
		void draw()
		{
			System.out.println("Circle shape drawing");
		}
	}
	class Rectangle extends Shape
	{
		void draw()
		{
			System.out.println("Rectangle shape drawing");
		}
		public static void main(String[] args)
		{
			Shape shape = new Shape();
			Shape c = new Circle();
			Shape r = new Rectangle();
			shape.draw();
			c.draw();
			r.draw();
		}
	}
	
