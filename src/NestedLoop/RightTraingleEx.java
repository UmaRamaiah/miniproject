package NestedLoop;

public class RightTraingleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  for (int i = 1; i <= 5; i++)
		  
		  {
	            // Print spaces for alignment
	            for (int j = 1; j <= 5 - i; j++)
	            {
	                System.out.print("  ");
	            }

	            // Print '*' for the right triangle
	            for (int k = 1; k <= i; k++)
	            {
	                System.out.print("* ");
	            }
	            
	            System.out.println();
			   }
		

	}

}

	 