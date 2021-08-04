package ExceptionDemo;

import java.io.IOException;

public class OutOfMemoryError {
	public class OutOfMemoryErrorDemo {
		
		public void createArray(int size)
		{
			try {
				Integer[] a =new Integer[size];
				
			}
			catch(OutOfMemoryError e)
			{
				
				//System.err is a PrintStream. System.err works like System.out except it is normally
				//only used to output error texts. Some programs (like Eclipse) will show
				//the output to System.err in red text, to make it more obvious that it is error text.
				System.err.println("array size is too large"+e);
				System.err.println("Maax JVM Memory :"+Runtime.getRuntime().maxMemory());
				System.out.println("JAVA version :"+Runtime.version());
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OutOfMemoryErrorDemo d1=new OutOfMemoryErrorDemo();
		d1.createArray(1000*1000*1000);
		try {
			Runtime.getRuntime().exec("mspaint");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
}
	


