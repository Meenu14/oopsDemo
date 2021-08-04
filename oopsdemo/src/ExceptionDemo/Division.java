package ExceptionDemo;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		int a, b, result;  
        Scanner input = new Scanner(System.in);
         System.out.println("Input two integers");
         a = input.nextInt();
         b = input.nextInt();  // enter 0
        result = a / b;  // throw arithematic exception
        System.out.println("Result = " + result);
        input.close();

	}

}
