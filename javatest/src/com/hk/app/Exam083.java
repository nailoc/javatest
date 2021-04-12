package com.hk.app;

import java.io.File;

public class Exam083 {
	
	public static void main(String[] args) {

	    // creates a file object with specified path
		String path = System.getProperty("user.dir") + "\\src\\";
	    File file = new File(path+ "directory");

	    // tries to create a new directory
	    boolean value = file.mkdir();
	    if(value) {
	      System.out.println("The new directory is created.");
	    }
	    else {
	      System.out.println("The directory already exists.");
	    }
	  }

}
