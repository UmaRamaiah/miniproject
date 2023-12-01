package NestedLoop;

public class patterntask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///LEFT Traingle
		{
			for(int i=1;i<=5;i++)//i=1 1<=5 2<=5 3<=5 
			{
				for(int j=1;j<=i;j++)//j=1,i=1  1<=1 2<=2 3<=2 4<=1 5<=1
				{
					System.out.print("*");//*
					                      //**
					                      //***
					                      //****
					                      //*****
				}
				System.out.println();//nextline
			}

	}

}
}
