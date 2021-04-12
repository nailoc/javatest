package com.hk.app;

import java.io.File;

public class Exam085 {
	
	public static void main(String[] args) {

	    // creates a file object
		String path = System.getProperty("user.dir") + "\\src\\text\\";
	    File file = new File(path);

	    // returns an array of all files
	    String[] fileList = file.list();

	    for(String str : fileList) {
	      System.out.println(str);
	    }
	  }

}
