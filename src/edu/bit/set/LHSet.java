package edu.bit.set;

import java.util.LinkedHashSet;

public class LHSet {

	public static void main(String[] args) {
		LinkedHashSet<String> movieList = new LinkedHashSet<String>();
		
		//adding elements
		movieList.add("Leo");
		movieList.add("Captain Miller");
		movieList.add("Animal");
		movieList.add("King Kong");
		movieList.add("King Kong");
		movieList.add("Breaking Bad");
		
		movieList.stream().forEach(System.out::println);
	}
}