package oopsdemo1;

import oopsDemo3.Demo;

// public access specifier

public class TestDemo {

	public static void main(String[] args) {
		Demo d1=new Demo();
		
		System.out.println("Public Variable of Demo class in another package: "+d1.a);
		d1.display();
	}

}
