package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MapTask {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	      HashMap<Character,List<String>>map=new HashMap<Character,List<String>>();
	      System.out.println("enter the alphabets");
	      char alphabet =sc.next().charAt(0);
	      List <String>avalue=new ArrayList<String>();

	      switch(alphabet)
	      {
	          case 'A':
	              avalue.add("apple");
	              avalue.add("aeroplane");
	              avalue.add("ant");
	              map.put(alphabet, avalue); 
	              break;
	          case 'B':
	              avalue.add("banana");
	              avalue.add("ball");
	              avalue.add("bowl");
	              map.put(alphabet, avalue); 
	              break;
	          case 'C':
	              avalue.add("cat");
	              avalue.add("camel");
	              avalue.add("cow");
	              map.put(alphabet, avalue); 
	              break;
	      }
	      
	      System.out.println(map);
	      

	}

}
