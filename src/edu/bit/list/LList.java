package edu.bit.list;

import java.util.LinkedList;         

public class LList {
	public static void main(String[] args) {
		LinkedList<String> actorList = new LinkedList<String>();
		
		//adding elements
		actorList.addLast("Vijay Kanth");
		actorList.add("Nazriya");
		actorList.add("Lokesh");
		actorList.addFirst("Sai Pallavi");
		
		//accessing elements
		actorList.forEach(actor -> System.out.println(actor));
		System.out.println(actorList.getFirst());
		System.out.println(actorList.getLast());
		
		//searching an element
		System.out.println(actorList.contains("Lokesh"));
		
		actorList.sort(null);
		actorList.forEach(actor -> System.out.println(actor));
		
		actorList.remove();
		actorList.removeFirst();
		actorList.removeLast();
		actorList.stream().forEach(System.out::println);
	}
}