package classes;

public class StudentAdmission {
	String name;
	String course;
	String admissionType;
	
	StudentAdmission()
	{
		name = "Sachin";
		course = "cs";
		admissionType = "general";
	}
	
	StudentAdmission(String name,String course)
	{
		this.name = name;
		this.course = course;
		admissionType = "merit";
	}
	
	void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Course: " + course);
		System.out.println("Admission Type " + admissionType);
		
	}
	public static void main(String[] args) {
	
		 StudentAdmission s1 = new  StudentAdmission();
		
		 StudentAdmission s2 = new  StudentAdmission("God","cs");
		 s1.display();
		 s2.display();
		
	}

}
