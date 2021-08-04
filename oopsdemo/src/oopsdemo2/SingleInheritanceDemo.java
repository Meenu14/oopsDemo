package oopsdemo2;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		Developer d1 =new Developer(101,"Meenu","IT");
		Developer d2 =new Developer(105,"rod jhonson","Spring Framework");
		
		Accountant a1= new Accountant(201,"Rakesh Sharma","Process Salary of employees","SAP");
		Accountant a2= new Accountant(271,"Rohit Sharma","Payments to vendor","Tally");

		
		d1.display(); 
		d1.display1();
		
		d2.display();
		d2.display1();
		
		a1.display();
		a2.display(); // invoke accountant class method
		
		
		
		
		
		
	}

}
