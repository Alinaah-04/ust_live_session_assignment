package classes;

public class Employee {
	int empId;
	String empName;
	float salary;
	Employee()
	{
		empId = 3;
		empName = "Sara";
		salary = 6000;
	}
	void displayDetails()
	{
		System.out.println("Id :" +empId);
		System.out.println("Name :" +empName);
		System.out.println("Salary :" +salary);
		
	}
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		
		emp.displayDetails();
	}
	
}
