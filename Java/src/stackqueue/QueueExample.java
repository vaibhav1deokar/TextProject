package stackqueue;

import java.util.PriorityQueue;
import java.util.PropertyResourceBundle;

public class QueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue <Integer> pq = new PriorityQueue<>();
		
		pq.add(10);
		pq.add(28);
		pq.add(64);
		pq.add(73);
		pq.add(97);
		pq.add(46);
		pq.add(39);
		pq.add(18);
		
		System.out.println(pq);
		
//		pq.remove();
//		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.element());
		
		pq.offer(50);
		System.out.println(pq);
	}

}
