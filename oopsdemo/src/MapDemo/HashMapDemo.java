package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// hashmap declaration  with key value pair
	
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		
		// add element to hash map
		hmap.put(12,"minu");
		hmap.put(18,"ravi");
		hmap.put(9,"rohan");
		hmap.put(15,"vnshu");
		hmap.put(13,"joshi");
		hmap.put(10,"jatin");
		
		// Display content using Iterator
        Set s=hmap.entrySet(); // return values from hmap
        Set s1=hmap.keySet();
        System.out.println(s);
       
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry mentry=(Map.Entry) itr.next();
            System.out.println(mentry.getKey()+"-->"+mentry.getValue());
        }
       
        System.out.println("*******************Key set**********");
        Iterator itr1=s1.iterator();
        while(itr1.hasNext())
        {
            Integer key=(Integer) itr1.next();
            String value=hmap.get(key);
            System.out.println(key+"---->"+value);
        }
        
        //get values based on key
        String name =hmap.get(49);
        System.out.println("The name with key 49 is: "+name);
        
        //remove value based on key
        hmap.remove(2);
        System.out.println(hmap);
 

	}
}
