package oopsdemo1;
import java.util.Scanner;

//program to demostrate working of constructor

class Person
{
	String name,constituency;
	int age;
	Scanner s;
	
	public Person() { // default constructor
		System.out.println("Voter Eligibility App");
		age=0;
		name="";
		constituency="Bengaluru";
		s=new Scanner(System.in);
		
	}

	public Person(String name, int age) { // parameterized constructor with two arguments
		this.name = name;
		this.age = age;
		constituency="Mumbai";
	}
	
	Person(String n,int a,String c) // parameterized constructor with three arguments
	{
		name=n;
		age=a;
		constituency=c;
		
	}
	
	void input()
	{
		System.out.println("Enter your name:");
		name=s.nextLine();
		System.out.println("Enter your age: ");
		age=s.nextInt();
		
	}
	
	void print()
	{
		System.out.println("Name: "+name);
		System.out.println("Age "+age);
		System.out.println("Constituency: "+constituency);
		
		
	}
	
	
	
	
}
public class PersonTest {

	public static void main(String[] args) {
		Person objPerson1= new Person();
		
		
		objPerson1.input();
		objPerson1.print();
		
		System.out.println("--------------------------------------");
		
		Person objPerson2= new Person("Mike",45); // invoke constructor with two arguments
		
		objPerson2.print();
		
System.out.println("--------------------------------------");
		
		Person objPerson3= new Person("ravi",67,"Delhi"); // invoke constructor with Three arguments
		
		objPerson3.print();
		
	}

}
