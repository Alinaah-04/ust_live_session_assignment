package classes;

public class Person {
	String name;
	int age;
	Person(String name)
	{
		this.name = name;
	}
	Person(String name,int age)
	{
		this(name);
		
		this.age= age;
	}
	void display()
	{
		System.out.println("Name is" + name);
		System.out.println("Age is" + age);
		
	}
	public static void main(String[] args)
	{
		Person person1 = new Person("Alina");
		Person person2 = new Person("god",90);
		person1.display();
		person2.display();
		
	}
	

}
