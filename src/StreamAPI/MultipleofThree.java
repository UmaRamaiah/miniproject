package StreamAPI;

import java.util.stream.Stream;

public class MultipleofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=20;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}*/
		Stream.iterate(1, count->count+1)  
        .filter(number->number%3==0)  
        .limit(6)  
        .forEach(System.out::println);  


	}




	}


