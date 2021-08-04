package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> a1=new ArrayList<Student>();
		
		Student s1=new Student(101,"mike",19);
		Student s2=new Student(181,"meenu",60);
		Student s3=new Student(321,"rohan",18);
		Student s4=new Student(107,"jivan",10);
		Student s5=new Student(171,"vnshu",11);
		
		// adding student to list
		a1.add(s2);a1.add(s3);a1.add(s1);a1.add(s4);a1.add(s5);
		
		Collections.sort(a1);
		
		System.out.println("*****************student sorted list based on age***************");
		for(Student s:a1)
		{
			System.out.println(s.rollNo+" "+s.name+" "+s.age);
		}
				
	}

}
