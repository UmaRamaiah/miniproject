package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		TreeSet <String>set=new TreeSet<String>();
		// TODO Auto-generated method stub
//		/LinkedHashSet <String>set=new LinkedHashSet<String>();
		set.add("java");
		set.add("c");
		set.add("python");
		set.add("java");
		set.add("cloud");
		set.add("html");
		System.out.println(set);
		
		System.out.println("============for -each");
		for(String temp:set)
		{
			System.out.println(temp);
		}
		System.out.println("============Iterator");
		Iterator<String>it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Object map;
		Iterator it1=( map).entrySet().iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}


	}

}
