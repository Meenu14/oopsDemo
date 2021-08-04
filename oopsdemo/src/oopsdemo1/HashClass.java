package oopsdemo1;

import java.util.Scanner;

public class HashClass {

	public static void main(String[] args) {
		char n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Char ");
		n=sc.next().charAt(0);
		while(n!='#')
		{
			System.out.println("Enter Char ");
			System.out.println(n);
			n=sc.next().charAt(0);
		}
	System.out.println("Out of Loop");
	}

}
	


