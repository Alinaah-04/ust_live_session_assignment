package exception;
import java.io.*;

public class MethodOverridingException {

	public static void main(String[] args) throws IOException{
		Parent p = new Child();
		p.show();
				
		
	}

}
class Parent
{
	void show() throws IOException
	{
		System.out.println("parent method printed");
	}
}
class Child extends Parent
{
	void show() throws FileNotFoundException
	{
		System.out.println("child method printed");
	}
}
