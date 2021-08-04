package oopsdemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		
		Addition a1=new Addition();
		
		// invoking add() overload method
		a1.add();
		a1.add(10,40);
		a1.add(20.0f,80.0f);
		a1.add(10,67,45);
		a1.add("Hello", "Meenu");
		
		
	}

}
