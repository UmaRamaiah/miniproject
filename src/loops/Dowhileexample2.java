package loops;

import java.util.Scanner;

public class Dowhileexample2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		do
		{
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		
		
			switch(choice)
			{
				case 1:System.out.println("Large");	
				break;
				case 2:System.out.println("medium");	
				break;
				case 3:System.out.println("small");	
				break;
			}
			System.out.println("do you want to continue");
			 s=sc.next();
		}
		while(s.equals("Y"));

	
	}

}
