package NestedLoop;

public class patterntask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        for (int i = 1; i <= 5; i++) //1<=5 2<=5 3<=5 4<=5 5<=5
        {
            for (int j = 1; j <= i; j++)//1<=1 2<=1
            	                        //2<=1 2<=2 2<=3 
            	                        //3<=1 3<=2 3<=3 3<=4
            	                        //4<=1 4<=2 4<=3 4<=
            {
                System.out.print(i);// 1 //22 //333 //4444 // 5555
            }
            System.out.println();
        }

	}

}
