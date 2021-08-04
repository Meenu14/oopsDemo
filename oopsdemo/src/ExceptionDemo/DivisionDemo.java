package ExceptionDemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		
		int a, b, result;  
        Scanner input = new Scanner(System.in);
         System.out.println("Input two integers");
         a = input.nextInt();
         b = input.nextInt();  
         
         try // statement to be monitored which may throw exception
         {
        	
             result = a / b;  
             System.out.println("Result = " + result);
         }
         catch(ArithmeticException e) // exception thrown is handled in catch block
         {
        	 System.out.println("Divide by zero Error");
        	 System.out.println("Exception Description :"+e.getMessage());
        	 System.out.println("Wxception Name and description: "+e.toString());
        	 // Details about exception name ,Description ,line number of code which generated exception
        	 
        	 e.printStackTrace();
        	 
         }
         
         finally // clean up opeartion
         {
        	 input.close();
        	 System.out.println("In finally block- program execution ended");
         }
       
	}

}
