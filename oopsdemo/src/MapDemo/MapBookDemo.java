package MapDemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import CollectionsDemo.Book;

// use treemap to store user defined objects

public class MapBookDemo {

	public static void main(String[] args) {
		
		// Create a map of books
		Map<Integer,Book> bookMap=new TreeMap<Integer,Book>();
		
		// create books
		
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);   
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);   
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        
        //add books to map
        bookMap.put(2,b3);
        bookMap.put(1,b1);
        bookMap.put(3,b2);
        
  //traversing in map
        
        for(Entry<Integer, Book> e:bookMap.entrySet())
        {
        	int key=e.getKey();
        	Book b=e.getValue();
        	System.out.println("Book :"+key+" Details : ");
        	System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()
        	
        			+" "+b.getQuantity());
        }
        

	}

}

	