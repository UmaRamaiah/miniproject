package loops;

import java.util.Scanner;

public class FactoralnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//6
		int start=1;
		while(start<=n)//1<=6 2<=6 3<=6 4<=6 5<=6 6<=6
		{
			if(n%start==0)//6%1==0 6%2==0 6%3==0 6%4==0 6%5==0
				//6%6==0
			{
				System.out.println(start);//1,2,3,6
			}
			start++;//2,3,4,5,6
		}


	}

}
