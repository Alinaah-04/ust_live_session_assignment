package Inheritance;

public class Employee {
	float salary;

}
class Manager extends Employee
{
	float bonus;
	float totalSalary;
	void calculateSalary()
	{
		totalSalary = salary + bonus;
		System.out.println("Total Salary :" +totalSalary);
	}
	public static void main(String[] args)
	{
		Manager mgr = new Manager();
		mgr.salary = 35000.55f;
		mgr.bonus = 6.99f;
		
		mgr.calculateSalary();
	}
}
