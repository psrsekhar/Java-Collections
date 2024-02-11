package edu.bit.set;

import java.util.TreeSet;

public class TSet {

	public static void main(String[] args) {
		TreeSet<String> routeList = new TreeSet<String>();		
		routeList.add("zyx");
		routeList.add("def");
		routeList.add("abc");
		routeList.add("abc");
		routeList.add("ces");
		
		routeList.stream().forEach(System.out::println);
	}
}