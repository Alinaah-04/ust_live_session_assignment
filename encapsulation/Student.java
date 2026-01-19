package encapsulation;

public class Student {
	private int  id = 1;;
	private String name = "alina";
	public int getid()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public static void main(String[] args)
	{
		Student s = new Student();
		System.out.println("id : " +s.getid());
		System.out.println("name: " +s.getName());
		s.setId(3);
		s.setName("God");
		System.out.println("id : " +s.getid());
		System.out.println("name: " +s.getName());
		}
}
