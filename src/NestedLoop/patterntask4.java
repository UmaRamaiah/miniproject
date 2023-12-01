package NestedLoop;

public class patterntask4 {

	public static void main(String[] args) 
	{
		
        for (int i = 1; i <= 5; i++) //1<=5 //2<=5 //3<=5 //4<=5 //5<=5
        	                         
        {
            
            for (int j = 1; j <= i; j++)//1<=1 
            	                        //1<=1 1<=2 
            	                       //1<=1 1<=2 1<=3 
            	                       //1<=1 1<=2 1<=3 1<=4 
            	                       // 1<=1 1<=2 1<=3 1<=4 1<=5
            {
                System.out.print(j);//1 //1 2 //1 2 3 //1 2 3 4 //1 2 3 4 5
            }
            System.out.println(); 
        }

	    
		 
		 
           
		}
	}

	
