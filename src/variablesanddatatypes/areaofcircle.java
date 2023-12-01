package variablesanddatatypes;

import java.util.Scanner;

public class areaofcircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pi");
		double pi=sc.nextDouble();
		System.out.println("enter r");
		double r=sc.nextDouble();
		double area=pi*r*r;
		
		System.out.println("Area of the circle:"+area);
		

	}

}
