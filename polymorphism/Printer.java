package polymorphism;

public class Printer {
	void print(int a)
	{
		System.out.println(a);
	}
	void print(String a)
	{
		System.out.println(a);
	}
	void print(int a,String b)
	{
		System.out.println(a + ":" + b);
	}
	public static void main(String[] args)
	{
		Printer pri = new Printer();
		pri.print(3);
		pri.print("Alina");
		pri.print(3,"Alina Ann");
	}

}
