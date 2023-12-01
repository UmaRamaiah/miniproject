package conditionalstatement;

public class GreatestnumberEx {

	public static void main(String[] args) 
	{
		int a=55, b=444, c=220;  
		if(a<b && a>=c) //55<444 && 55>=220
		{
		System.out.println(a+" is the Greatest Number");
		
		}
		else if (b>=a || b<=c)//444
		{
			System.out.println(b+" is the Greatest Number");  
		}
		else   
		{
			System.out.println(c+" is the Greatest number");  
		}

	}

}
