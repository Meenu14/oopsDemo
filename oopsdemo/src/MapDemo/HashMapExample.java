package MapDemo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String,Double> hm=new HashMap<String,Double>();
		
		hm.put("Meenu",5000.50);
		hm.put("Jim",4200.22);
		hm.put("rohan",4900.22);
		hm.put("kajal",4970.92);
		hm.put("monty",9000.22);
		
		 System.out.println("Display Customer: ");
		 
		for(String k:hm.keySet())
		{
			System.out.println(k+"-->"+hm.get(k));
		}
		
		// deposite to 1000 to jim's account
		double bal=hm.get("Jim");
		hm.put("Jim",bal+1000);
		System.out.println("Jims new balance is :"+hm.get("Jim"));
		
		hm.putIfAbsent("meenu",5000.50);
		System.out.println(hm);
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Customer Name for his Balance :");
	       String name=s.next();
	       System.out.println("The Balance of "+name+ " is :"+hm.get(name));
		
		   
		
	}

}
