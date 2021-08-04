package oopsdemo2;

public class Accountant extends Employee { // child card derived from Employee parent class
	
	String task,tech;



	public Accountant(int empId, String name,String t1,String t2) {
		super(empId, name);
		this.task=t1;
		this.tech=t2;
		
	}
	
	void display()
	{
		super.display(); // invoke base class display() method
		System.out.println("Accountant Task "+task);
		System.out.println("Software used: "+tech);
	}
		

}
