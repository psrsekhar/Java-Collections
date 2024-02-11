package edu.bit.map;

import java.util.Hashtable;
import java.util.Map;

public class HTable {

	public static void main(String[] args) {
		Hashtable<String, Integer> playerRuns = new Hashtable<String, Integer>(); 
		playerRuns.put("Sachin", 34000);
		playerRuns.put("VK", 21000);
		playerRuns.put("MSD", 17000);
		playerRuns.put("RS", 16000);
		
		for(Map.Entry<String, Integer> player: playerRuns.entrySet()) {
			System.out.println("Player: " + player.getKey() + " Runs: " + player.getValue());
		}
	}
}