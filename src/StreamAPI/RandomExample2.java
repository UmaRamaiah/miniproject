package StreamAPI;

import java.util.Random;

public class RandomExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		for(int i=0;i<=20;i++)
		{
       float x=r.nextFloat(100);
       System.out.println(x);
		}
       

	}

}
