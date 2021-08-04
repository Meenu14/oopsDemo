package miscelleneous;

class Sample<T> // parameterized class
{
	private T data; //generic variable declaration

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}

public class GenericClassDemo {

	public static void main(String[] args) {
		
		Sample<String> s1=new Sample<String>("Java Generics"); // object for generic classfor type string
		System.out.println("Display from Generic class by passing String object :"+s1.getData());	
		
		Sample<Integer> s2=new Sample<Integer>(200);
		System.out.println("Display from Generic class by Integer String object :"+s2.getData());	
		
		Sample<Double> s3=new Sample<Double>(550.55);
		System.out.println("Display from Generic class by Integer Double object :"+s3.getData());	
		
	}

}
