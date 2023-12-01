package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        scanner.close();

	        if (n < 0) {
	            System.out.println("Factorial is not defined for negative numbers");
	        } 
	        else 
	        {
	            int factorial = 1;
	            String expression = "";

	            for (int i = 1; i <= n; i++) 
	            {
	                factorial *= i;
	                expression += i;
	                if (i < n) {
	                    expression += "*";
	                }
	            }

	            System.out.println(expression + "=" + factorial);
	        }
	}

}
