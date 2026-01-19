package encapsulation;

public class Employee {
	private int empid;
	private double salary;
	public int getid()
	{
		return this.empid;
	}
	public void setid(int id)
	{
		this.empid = id;
	}
	public double getsalary()
	{
		return this.salary;
	}
	public void setsalary(double salary)
	{if(salary>0)
	{
		this.salary = salary;
	}
	}
	void displaysalary()
	{
		System.out.println("Salary is :" + salary);
	}
public static void main(String[] args)
{
	Employee emp = new Employee();
	emp.setsalary(70000);
	emp.displaysalary();
}
}
