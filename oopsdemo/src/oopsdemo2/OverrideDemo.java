package oopsdemo2;

class Bank
{
	int getrateofInterest()
	{
		return 0;
	}
	
	void display()
	{
		System.out.println("WElcome in Bank");
	}
}

class SBI extends Bank
{
	int getrateofInterest() // override method
	{
		return 5;
	}
}

class ICICI extends Bank
{
	int getrateofInterest() // override method in chlid class
	{
		return 7;
	}
}

class AXIS extends Bank
{
	int getrateofInterest() // override method in chlid class
	{
		return 6;
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		
		SBI b1=new SBI();
		ICICI b2=new ICICI();
		AXIS b3=new AXIS();
		
		b1.display();
		System.out.println("The interest rate of SBI is: "+b1.getrateofInterest());
		
		b2.display();
		System.out.println("The interest rate of ICICI is: "+b2.getrateofInterest());
		
		b3.display();
		System.out.println("The interest rate of AXIS is: "+b3.getrateofInterest());
		
	}

}
