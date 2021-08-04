package oopsdemo1;

class Test
{
	public void finalize()  // override finalize() method of object class
	{
		System.out.println("Object destroyed & garbage collection");
	}
}


public class DestructorDemo {

	public static void main(String[] args) {
		
		Test t1=new Test(); // initialize object --- called default constructor
		Test t2=new Test();
		
		t1=null;  // de allocate memory
		t2=null;
		
		System.gc(); // invoke service method gc () ---> invoke finalize()
		
		System.out.println("In main method");
		
	}

}
