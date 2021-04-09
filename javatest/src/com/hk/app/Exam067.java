package com.hk.app;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam067 {
	
	public static void main(String[] args) {
	    ArrayList<String> languages= new ArrayList<>();

	    // Add elements in the arraylist
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    System.out.println("ArrayList: " + languages);

	    // Create a new array of String type
	    String[] arr = new String[languages.size()];

	    // Convert ArrayList into the string array
	    languages.toArray(arr);
	    System.out.print("Array: ");
	    for(String item:arr) {
	      System.out.print(item+", ");
	    }
	    
	    ////////////////////////////////////////////
	   
	    // create an array
	    System.out.println();
	    String[] array = {"Java", "Python", "C"};
	    System.out.println("Array: " + Arrays.toString(array));

	    // convert array to arraylist
	    ArrayList<String> languages2= new ArrayList<>(Arrays.asList(array));

	    System.out.println("ArrayList: " + languages2);
	  }

}
