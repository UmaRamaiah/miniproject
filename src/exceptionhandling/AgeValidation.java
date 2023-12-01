package exceptionhandling;

public class AgeValidation {


		// TODO Auto-generated method stub
		public static void Validate(int age) throws Exception,ArithmeticException
		{
			if(age>18)
			{
				System.out.println("welcome to vote");
			}
			else
			{
				throw new Exception("not eligible for vote");
			}
		}

		public static void main(String[] args) throws Exception {
			Validate(9);

		}


	

}
