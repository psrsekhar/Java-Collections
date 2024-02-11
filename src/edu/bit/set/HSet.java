package edu.bit.set;

import java.util.HashSet;

public class HSet {

	public static void main(String[] args) {
		HashSet<Integer> studentIdList = new HashSet<Integer>();
		
		//adding elements
		studentIdList.add(10);
		studentIdList.add(20);
		studentIdList.add(20);
		studentIdList.add(13);
		studentIdList.add(32);
		
		System.out.println(studentIdList.size());
		studentIdList.stream().forEach(System.out::println);
	}
}