package edu.bit.map;

import java.util.HashMap;
import java.util.Map;

public class HMap {

	public static void main(String[] args) {
		HashMap<String, Integer> ratings = new HashMap<String, Integer>();
		
		ratings.put("Leo", 4);
		ratings.put("Joe", 5);
		ratings.put("12thFail", 5);
		
		System.out.println(ratings.get("Leo"));
		
		System.out.println(ratings.keySet());
		System.out.println(ratings.values());
		
		for(Map.Entry<String,Integer> movie: ratings.entrySet()) {
			System.out.println("Movie: " + movie.getKey() + " Rating: " + movie.getValue());
		}
	}
}