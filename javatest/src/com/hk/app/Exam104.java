package com.hk.app;

public class Exam104 {
	
	int sum;

	  // first constructor
	Exam104() {
	    // calling the second constructor
	    this(5, 2);
	  }

	  // second constructor
	Exam104(int arg1, int arg2) {
	    // add two value
	    this.sum = arg1 + arg2;
	  }

	  void display() {
	    System.out.println("Sum is: " + sum);
	  }

	  // main class
	  public static void main(String[] args) {

	    // call the first constructor
		  Exam104 obj = new Exam104();

	    // call display method
	    obj.display();
	  }
	

}
