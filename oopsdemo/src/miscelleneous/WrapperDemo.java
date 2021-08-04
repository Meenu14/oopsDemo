package miscelleneous;

public class WrapperDemo {

	public static void main(String[] args) {
		
		//create primitive types
		
		int a=5;
		float b=10.10f;
		
		
		// convert in to wrapper object
		
		Integer aObj=a; // auto boxing- convert value type to object
		Float bObj=b;
		
		// Create wrapper class object
		
		Integer x =Integer.valueOf(100);
		Double y=Double.valueOf(20000.00);
		
		
		// convert into primitive type
		
		int p=x.intValue(); // Unboxing-- convert object to primitive type or value type
		double q=x.doubleValue();
		
		System.out.println(p +" "+q);
		System.out.println(aObj + " "+bObj);
		
		char e='a';
		Character  objE=e; //boxing
		System.out.println("objE");
		System.out.println(objE.isUpperCase(e));
		
		Double d=200.55;
		Double objD=Double.valueOf(d);
		System.out.println(objD);
		System.out.println(Double.toHexString(d));
		System.out.println(Integer.toHexString(15));
		
		String hex="0xff";
		String oct="005";
		
		System.out.println(Integer.decode(oct));
		System.out.println(Integer.decode(hex));
		
		
	
		
	}

}
