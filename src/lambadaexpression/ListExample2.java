package lambadaexpression;

import java.util.Arrays;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> list= Arrays.asList(12,13,14,14,16,17);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
System.out.println("Single Line lambada ");
list.forEach(x->System.out.println(x));
System.out.println("multi line lambada ");

list.forEach(x->{
	x=x+2;// we can use local variable like y=x+2 and print y//
	System.out.println(x);
});
	


	}
}
