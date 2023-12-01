package collection;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>p=new PriorityQueue<Integer>();
		p.add(13);
		p.add(78);
		p.add(99);
		p.add(67);
		p.add(55);
		System.out.println(p);
		System.out.println(p.peek());//its retrieve the data from the first position
		System.out.println(p.poll());//its retrieve and remove from the first position
		System.out.println(p);
		
		System.out.println(p.element());//its retrieve the data from the first position
		System.out.println(p.remove());//its retrieve and remove from the first position
		System.out.println(p);
        

	}

}
