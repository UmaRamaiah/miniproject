package loops;

import java.util.Scanner;

public class TableExDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the number");
				int n=sc.nextInt();//123
				int digit=0;
				do
				{
					digit=n%10;//3
					System.out.println(digit);//3 2 1
					n=n/10;//n=12 n=1 0
				}
				while(n!=0);

	}

}
}
