package edu.bit.list;

import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		Vector<String> players = new Vector<String>();
		
		//adding elements
		players.add("MSD");
		players.add("VK");
		players.add("RS");
		players.add(3, "RJ");
		
		//accessing elements
		System.out.println("Player at index 2 : " + players.get(2));
		players.stream().forEach(System.out::println);
		
		players.sort(null);
		players.stream().forEach(System.out::println);
	}
}