package oopsdemo1;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee e1 = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
	    Employee e2 = new Employee("Sam", 2000, 740000, "68d- WallsStreet");
	    Employee e3 = new Employee("John", 1999, 600000, "26B- WallsStreet");
	    System.out.println("Name\tYear of joining\tSalary\tAddress");
	    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t"+
	    e1.getSalary()+"\t"+e1.getAddress());  // printing details of employee 1
	    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t"+
	    e2.getSalary()+"\t"+e2.getAddress());  // printing details of employee 2
	    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t"+
	    e3.getSalary()+"\t"+e3.getAddress());  // printing details of employee 3
	  }

	}
	


