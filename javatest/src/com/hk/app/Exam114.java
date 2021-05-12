package com.hk.app;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Exam114 {
	
	public static void main(String[] args) {

		String workpath = System.getProperty("user.dir");
		
	    // creates a file object
	    File file = new File(workpath+"\\src\\com\\hk\\app\\JavaFile.java");

	    // deletes the file
	    boolean value = file.delete();
	    if(value) {
	      System.out.println("JavaFile.java is successfully deleted.");
	    }
	    else {
	      System.out.println("File doesn't exit");
	    }
	  }
}
