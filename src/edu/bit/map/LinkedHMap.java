package edu.bit.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHMap {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> highestScoreList = new LinkedHashMap<String, Integer>();
		highestScoreList.put("Sachin", 200);
		highestScoreList.putLast("MSD", 183);
		highestScoreList.putFirst("VK", 183);
		highestScoreList.put("RS", 264);		
		
		
		for (Map.Entry<String, Integer> playerScore : highestScoreList.entrySet()) {
			System.out.println("Player: " + playerScore.getKey() + " HS: " + playerScore.getValue());
		}
	}
}