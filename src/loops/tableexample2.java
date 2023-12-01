package loops;

import java.util.Scanner;

public class tableexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		   System.out.println("enter the number");
		   int n=sc.nextInt();//5
		   for(int i=1;i<=10;i++)//1<=10 2<=10
		   {
			   System.out.println(n+"*"+i+"="+n*i);//
			                      //5*1=5
			                      //5*2=10
		   }
		   

	}

}
