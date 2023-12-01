package loops;

import java.util.Scanner;

public class EvenOddEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int a=sc.nextInt();
		while(a<=5) {
			if(a%2==0)
			{
				System.out.println("Even Number="+a);
				}
			else
			{
				System.out.println("Odd Number"+a);
			}
			a++;
		}
		

	}

}
