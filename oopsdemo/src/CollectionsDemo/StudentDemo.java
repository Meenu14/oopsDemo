package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(101,90,"mike","ECE");
		Student s2=new Student(102,71,"mike","CSE");
		Student s3=new Student(103,52,"mike","IS");
		Student s4=new Student(104,63,"mike","EEE");
		Student s5=new Student(105,54,"mike","MECH");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		Collections.sort(al);
		for(Student s:al)
		{
		System.out.println(s);
		}
	}

}



public class Student implements Comparable<Student>{
	int rollno,marks;
	String name,course;
	public Student(int rollno, int marks, String name, String course) {
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
		this.course = course;
	}

	@Override
	public int compareTo(Student o) {
		if(marks==o.marks)
		{
			return 0;
		}
		else if(marks>o.marks)
		{
			return 1;
		}
		else
			return -1;
		
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno  + ", name=" + name + ", course=" + course + ", marks=" + marks+ "]";
	}
	
	



	}


