package ExceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		String languages[]= {"c","C++","java","perl","python"};
		
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(languages[i]);
			}
			
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
