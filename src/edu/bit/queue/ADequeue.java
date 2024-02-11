package edu.bit.queue;

import java.util.ArrayDeque;

public class ADequeue {

	public static void main(String[] args) {
		ArrayDeque<String> printerPool = new ArrayDeque<String>();
		
		printerPool.offer("a.pdf");
		printerPool.offerFirst("b.pdf");
		printerPool.offerLast("c.doc");
		
		System.out.println(printerPool.peekFirst());
		System.out.println(printerPool.peekLast());
		
		System.out.println(printerPool.pollLast());
		System.out.println(printerPool.pollFirst());
	}
}