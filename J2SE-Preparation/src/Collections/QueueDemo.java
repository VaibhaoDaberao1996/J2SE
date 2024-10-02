package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		ArrayDeque q = new ArrayDeque();
		
		q.offer("eee");
		q.offer("ddd");
		q.offer("aaa");
		q.offer("bbb");
		
		System.out.println(q);
		System.out.println(q.pollLast());
		System.out.println(q);
	}
}
