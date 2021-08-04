package oopsDemo3;

final class Hello
{
	final void display()
	{
		System.out.println("This is a final method");
	}
}

/*class world extends Hello // final classes cannot be extended


{
	// final method cannot be overridden
	final void display()
	{
		System.out.println("This is a final method");
	}
 } */

public class FinalDemo {

	public static void main(String[] args) {
		
	 final int  AGE=21;
	 final float PI=3.142f;
	
	// AGE=30; --> compilation error- final variables values cannot be change
	}

}
