package variablesanddatatypes;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.print("Enter weight:");
	      double weight = sc.nextDouble();
	      System.out.print("Enter height");
	      double height = sc.nextDouble();
	      double BMI = weight / (height * height);
	      System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");
		

	}

}
