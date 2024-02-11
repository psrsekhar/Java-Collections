package edu.bit.list;

import java.util.ArrayList;
import java.util.Iterator;

public class AList {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		//adding elements to collection
		marks.add(10);
		marks.add(40);
		marks.add(20);
		marks.add(10);
		marks.add(4, 23);
		
		//accessing elements
		for(int i =0; i < marks.size(); i++) {
			System.out.println(marks.get(i));
		}
		
		for(int mark: marks) {
			System.out.println(mark);
		}
		
		Iterator<Integer> iterator = marks.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		marks.forEach(mark->System.out.println(mark));
		
		//searching element
		System.out.println(marks.contains(20));
		
		//removing element
		marks.remove(0);
	}
}