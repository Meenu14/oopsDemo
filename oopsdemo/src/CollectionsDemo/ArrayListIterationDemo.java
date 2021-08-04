package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterationDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Meenu");
		names.add("Niki");
		names.add("Vanshu");
		names.add("sahil");
		names.add("Satyam");
		
		System.out.println(names);
		
		// Iterate Interface  for traversing
		Iterator<String> itr=names.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(names.get(1));
		
		names.add(3,"Raj"); // adding element in specific location
		names.remove(0); // delete first element
		names.set(1,"java"); //replace existing element
		
		System.out.println("** Display   collection using for each loop**");
		
		for(String i:names)
		{
			System.out.println(i);
		}
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(999.50);
		marks.add(989.50);
		marks.add(499.50);
		marks.add(929.50);
		marks.add(969.50);
		
		System.out.println();
		for(Double i:marks)
			
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
	
		
		
	}

}
