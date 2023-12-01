package loops;

import java.util.Scanner;

public class multipleof3naturalnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("limit:");
	     int limit = scanner.nextInt();
	     System.out.println("Multiples of 3  Natural Numbers  " + limit + ":");
	        int start = 1;
	        while (start <= limit) 
	        {
	            if (start % 3 == 0) 
	            {
	                System.out.println(start);
	            }
	            start++;
	        }

	}

}
