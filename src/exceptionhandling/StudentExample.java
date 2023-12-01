package exceptionhandling;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks of Five Sub : ");
		int m1,m2,m3,m4,m5;
		
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	    m4=sc.nextInt();
	    m5=sc.nextInt();
	    double percentage=(m1+m2+m3+m4+m5)/500.0*100;
	    System.out.println(percentage);
	    if(percentage>100) {
	    	System.out.println("Eligible for interview");
	    }
	    else
	    {
	    	try {
	    		throw new Exception("Not Eligible for interview");
	    	}
	    	
	    		catch(Exception e)
	    		{
	    			System.out.println(e);
	    		}
	    	}
	    }

	}


