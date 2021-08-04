package CollectionsDemo;

import java.util.HashSet;
import java.util.Set;

// hash set with user defined objects

public class HashSetDemoUserDefined {

	public static void main(String[] args) {
		
		Set<Customer> customers=new HashSet<Customer>();
		
		// add new customer object to set
		
		customers.add(new Customer(101,"meenu","karnal"));
		customers.add(new Customer(191,"raju","kaithal"));

		customers.add(new Customer(101,"roma","delhi"));

		customers.add(new Customer(101,"rohit","noida"));

		customers.add(new Customer(101,"manuu","pune"));
		
		// add duplicate customer
		
		/*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */

        customers.add(new Customer(101,"roma","delhi"));
        
        for(Customer i:customers)
        {
        	System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
        }


	}

}
