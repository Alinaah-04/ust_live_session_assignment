package classes;

public class Student {
	int id;
	String name;
	void displayDetails()
	{
		System.out.println("Id :"+ id);
		System.out.println("Name :"+ name);
		
	}
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.id = 3;
		s1.name = "Alina";
		s1.displayDetails();
	}

}
