package Strings;

import java.util.Scanner;

public class Task3ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the sentence");
		String sentence=sc.nextLine();
		 String word[]=sentence.split(",");
		 for(String temp:word)//for each loop
		 {
			 System.out.println(temp);
		 }

	}



	}


