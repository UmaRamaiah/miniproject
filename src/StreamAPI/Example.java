package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		//int count = 0;
		//for (String str : names) 
		//{if (str.length() < 6) count++; }//
		long count = names.stream().filter(str->str.length()<6).count();
        System.out.println("There are "+count+" strings with length less than 6");
        
       // Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        // another method
        Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream.forEach(p -> System.out.println(p));
	        
	}

}
