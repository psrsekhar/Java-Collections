package edu.bit.queue;

import java.util.Deque;
import java.util.LinkedList;

public class LLDequeue {

	public static void main(String[] args) {
		Deque<String> orderQueue = new LinkedList<String>();
		
		orderQueue.offer("order1");
		orderQueue.offerLast("order2");
		orderQueue.offerFirst("order3");
		
		System.out.println(orderQueue.peekFirst());
		System.out.println(orderQueue.peekLast());
		
		System.out.println(orderQueue.pollFirst());
		System.out.println(orderQueue.pollLast());
	}
}