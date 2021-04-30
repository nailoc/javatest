package com.hk.app;

import java.util.ArrayList;

public class Exam108 {
	
	// create a method
	  public void display() {
	    System.out.println("Calculating Method execution time:");
	  }

	  // main method
	  public static void main(String[] args) {

	    // create an object of the Main class
		  Exam108 obj = new Exam108();

	    // get the start time
	    long start = System.nanoTime();

	    // call the method
	    obj.display();

	    // get the end time
	    long end = System.nanoTime();

	    // execution time
	    long execution = end - start;
	    System.out.println("Execution time: " + execution + " nanoseconds");
	  }
	

}
