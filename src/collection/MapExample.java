package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(1, "apple");
		map.put(2,"orange");
		map.put(2, "banana");
		map.put(3, "grapes");
		map.put(5, "orange");//it will accept the value duplicates //
		map.put(4, "dragon fruit");// it will not accept the key duplicate//
		System.out.println(map);
		System.out.println("================Iterator loop");
		Iterator it=map.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
       System.out.println("for -each loop");
       for(Entry<Integer, String> m:map.entrySet())
       {
    	   System.out.println(m);
       }


	}

}
