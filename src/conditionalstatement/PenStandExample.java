package conditionalstatement;

import java.util.Scanner;

public class PenStandExample {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	     
	        System.out.print("How many pens would you like to put in the pen stand? ");
	        int numberOfPens = scanner.nextInt();

	      if (numberOfPens > 5) 
	      {
	            System.out.println("PEN STAND IS FULL");
	        } 
	      else 
	        {
	            System.out.println("You can put " + numberOfPens + " pens in the pen stand.");
	        }
	               
	}

}
