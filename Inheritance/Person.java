package Inheritance;

public class Person {
	String name;
	
	Person(String name)
	{
		this.name = name;
	}
	
	void displayDetails()
	{
		System.out.println("Name :" + name);
		
		}
}
class Student extends Person
{
	
	int roll_no;
	
	Student(String name,int roll_no)
	{ 
		super(name);
		this.roll_no = roll_no;
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Roll no " + roll_no);
	}
	
	public static void main(String[] args)
	{
		
		Student student = new Student("Alina",3);
		student.displayDetails();
		
}
}
