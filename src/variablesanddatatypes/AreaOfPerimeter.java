package variablesanddatatypes;

import java.util.Scanner;

public class AreaOfPerimeter {

	public static void main(String[] args) {
		int l,b,perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("lenght of rectangle:");
		l=sc.nextInt();
		System.out.print("breadth of rectangle:");
		b=sc.nextInt();
		perimeter = 2*(l+b);
		System.out.println("perimeter of rectangle:"+perimeter);
		

	}

}
