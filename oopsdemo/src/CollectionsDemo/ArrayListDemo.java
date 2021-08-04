package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// generic arrayList
		ArrayList<String> a1=new  ArrayList<String>();
		
		//add elements to arraylist
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("C# 5.0");
		
		System.out.println(a1);
		
		// get elements by index
		System.out.println("Element at Index 1: "+a1.get(1));
		
		System.out.println("Does list contains element Java?: "+a1.contains("Java"));
		
		// add element at specific index
		a1.add(2,"Oracle");
		System.out.println(a1);
		
		System.out.println("Is ArrayList empty :"+a1.isEmpty());
		System.out.println("Index of Perl :"+a1.indexOf("Perl"));
		System.out.println("Size of ArrayList :"+a1.size());
		
		Collections.sort(a1);
		System.out.println("array list after sorting: "+a1);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		
		a2.add(100);
		a2.add(300);
		a2.add(400);
		a2.add(700);
		a2.add(800);
		
		
		
		System.out.println(a2);
		System.out.println("size :"+a2.size());
		
		
		
	}

}
