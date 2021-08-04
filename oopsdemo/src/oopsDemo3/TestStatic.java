package oopsDemo3;

public class TestStatic {

	public static void main(String[] args) {
		
		Student.collegeChange(); // invoke static method even before creati ng obj
		
		Student s1=new Student(101,"mike");
		Student s2=new Student(102,"meenu");
		
		Student s3=new Student(103,"raja");
		
		s1.display();
		s2.display();
		s3.display();
		
		

	}

}
