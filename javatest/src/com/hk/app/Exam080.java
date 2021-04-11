package com.hk.app;

import java.util.*;

public class Exam080 {
	
	public static void main(String[] args) {

	    // create a map and store elements to it
	    LinkedHashMap capitals = new LinkedHashMap<>();
	    capitals.put("Nepal", "Kathmandu");
	    capitals.put("India", "New Delhi");
	    capitals.put("United States", "Washington");
	    capitals.put("England", "London");
	    capitals.put("Australia", "Canberra");

	    // call the sortMap() method to sort the map
	    Map result = sortMap(capitals);

	    for (Map.Entry entry : result.entrySet()) {
	      System.out.print("Key: " + entry.getKey());
	      System.out.println(" Value: " + entry.getValue());
	    }
	  }

	  public static LinkedHashMap sortMap(LinkedHashMap map) {
	    List capitalList = new LinkedList<>(map.entrySet());

	    // call the sort() method of Collections
	    Collections.sort(capitalList, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));

	    // create a new map
	    LinkedHashMap result = new LinkedHashMap<>();

	    // get entry from list to the map
	    for (Map.Entry entry : capitalList) {
	      result.put(entry.getKey(), entry.getValue());
	    }

	    return result;
	  }

}
