package oopsdemo2;

public class Addition {
	
	void add()
	{
		System.out.println("Method Overloading Demo");
	}
    
	void add(int a,int b)
	{
		System.out.println("Addition of two numbers is :" +(a+b));
	}
	
	void add(float a,float b)
	{
		System.out.println("Addition of two float number is :"+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Addition of Three numbers is: "+(a+b+c));
	}
	
	void add(String s1,String s2)
	{
		System.out.println("Addition of two Strings is: "+(s1+s2));
	}
}
