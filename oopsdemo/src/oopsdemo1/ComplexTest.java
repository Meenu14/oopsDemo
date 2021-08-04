package oopsdemo1;

public class ComplexTest {

	public static void main(String[] args) {
		
		Complex c1= new Complex(10.3,67.4);
		Complex c2= new Complex(0.7,3.6);
		
		c1.add(c2); //calls method ad() by passing object c2
		
		System.out.println("The addition of two complex number is:");
		c1.display();
	}

}
