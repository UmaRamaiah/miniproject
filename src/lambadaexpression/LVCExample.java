package lambadaexpression;

import java.util.Arrays;
import java.util.List;

public class LVCExample {

	public static void main(String[] args) {
		int var = 10; //svc
		
		List<Integer> intSeq = Arrays.asList(1,2,3); 
		//int var = 10;//
		intSeq.forEach(x -> System.out.println(x + var));
	}

}
