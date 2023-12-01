package exceptionhandling;

public class ArithmeticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		try
		
		{
		int i=9,j=0;
		int k=i/j;
		System.out.println("hello");
		
		System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(k);
			
		}
	
	}


	}
