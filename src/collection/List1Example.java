package collection;

import java.util.TreeSet;

import java.util.Iterator;

public class List1Example {

			public static void main(String[] args) {
				TreeSet <String>set=new TreeSet<String>();
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


	}

}
