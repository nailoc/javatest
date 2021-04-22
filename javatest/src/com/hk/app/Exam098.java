package com.hk.app;

public class Exam098 {
	
	public static void main(String[] args) {

	    // create primitive types
	    int var1 = 5;
	    double var2 = 5.65;
	    boolean var3 = true;

	    //converts into wrapper objects
	    Integer obj1 = Integer.valueOf(var1);
	    Double obj2 = Double.valueOf(var2);
	    Boolean obj3 = Boolean.valueOf(var3);

	    // checks if obj are objects of
	    // corresponding wrapper class
	    if(obj1 instanceof Integer) {
	      System.out.println("An object of Integer is created.");
	    }

	    if(obj2 instanceof Double) {
	      System.out.println("An object of Double is created.");
	    }

	    if(obj3 instanceof Boolean) {
	      System.out.println("An object of Boolean is created");
	    }
	    
	    ///
	 // creates objects of wrapper class
	    Integer obj11 = Integer.valueOf(23);
	    Double obj22 = Double.valueOf(5.55);
	    Boolean obj33 = Boolean.valueOf(true);

	    // converts into primitive types
	    int var11 = obj11.intValue();
	    double var22 = obj22.doubleValue();
	    boolean var33 = obj33.booleanValue();

	    // print the primitive values
	    System.out.println("The value of int variable: " + var11);
	    System.out.println("The value of double variable: " + var22);
	    System.out.println("The value of boolean variable: " + var33);
	    
	  }
	
	

}
