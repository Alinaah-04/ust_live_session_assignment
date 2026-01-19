package encapsulation;

public class Customer {
	private String name;
	private int age;
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		if(age>=18)
		{
			this.age = age;
		}
		else
		{
			System.out.println("invalid");
			
		}
	}
	public String getcustomerDetails()
	{
		return "Name :" + name +"\n "+ "Age :" + age;
	}
	public static void main(String[] args)
	{
		Customer cus = new Customer();
		cus.setAge(19);
		cus.setName("god");
		System.out.println(cus.getcustomerDetails());
	}

}
