package collection;

import java.util.LinkedHashMap;

public class LinkedHashMaPexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	

			
				LinkedHashMap<Integer,String>map=new LinkedHashMap<Integer,String>();
				map.put(1, "apple");
				map.put(2,"orange");
				map.put(2, "banana");
				map.put(3, "grapes");
				map.put(5, "orange");
				map.put(4, "dragon fruit");
				System.out.println(map);// it will give the output in the given insertion order//
                                        //and it will remove the key duplicate//
				


	}

}
