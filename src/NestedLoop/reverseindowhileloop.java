package NestedLoop;

import java.util.Scanner;

public class reverseindowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int n=sc.nextInt();//123
			int rev=0,digit=0;
			do//123!=0 12!=0 1!=0
			{
				digit=n%10;//123%10=3 12%10=2 1%10=1
				rev=rev*10+digit;//rev=0*10=0+3=3 rev=3*10=30+2=32 rev=32*10=320+1=321
				n=n/10;//123/10=12 12/10=1 
				
			}
			
			while(n!=0);
			System.out.println("The reverse =:"+rev);
		}

	}

