package edu.bit.queue;

import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {
		PriorityQueue<String> orders = new PriorityQueue<String>();	
		orders.offer("Order2");
		orders.add("Order1");	
		orders.offer("Order3");
		orders.offer("Order4");
		orders.offer("Order5");
		
		System.out.println(orders.peek());
		System.out.println(orders.poll());
	}
}