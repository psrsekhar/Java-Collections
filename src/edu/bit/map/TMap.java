package edu.bit.map;

import java.util.Map;
import java.util.TreeMap;

public class TMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> distanceList = new TreeMap<String, Integer>();
		distanceList.put("VillageD", 21);
		distanceList.put("VillageB", 4);
		distanceList.put("VillageA", 15);
		distanceList.put("VillageC", 11);
		
		for(Map.Entry<String, Integer> village: distanceList.entrySet()) {
			System.out.println("Village: " + village.getKey() + " Distance(in kms): " + village.getValue());
		}
	}
}