package edu.bit.list;

import java.util.Stack;

public class S {

	public static void main(String[] args) {
		Stack<String> history = new Stack<String>();
		
		//adding elements
		history.add("www.google.com");
		history.push("www.youtube.com");
		history.push("www.facebook.com");
		history.push("www.instagram.com");
		
		//accessing elements			
		System.out.println(history.peek());		
		System.out.println(history.pop());		
	}
}