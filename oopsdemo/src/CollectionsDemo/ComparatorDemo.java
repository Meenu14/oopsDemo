package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Developer> a1=new ArrayList<Developer>();
		
		Developer d1=new Developer(103,"mike","Java");
		Developer d2=new Developer(105,"mary","dot net");
		Developer d3=new Developer(101,"ravi","angular");
		Developer d4=new Developer(102,"hary","php");
		Developer d5=new Developer(193,"naveen","oracle");
		
		a1.add(d1);a1.add(d2);a1.add(d3);a1.add(d4);a1.add(d5);
		
		System.out.println("***************Unsorted*****************");
		
		for(Developer i:a1)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
		
		// sory by id
		Collections.sort(a1,new IdComparator());
		
		System.out.println("************Sort by id**************");
		
		for(Developer i:a1)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
		
		//sort domain of developer
				Collections.sort(a1, new DomainComparator());
		System.out.println("****Sort by Domain*******");
				
				for(Developer i:a1)
				{
				System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());	
				}
			}

		}