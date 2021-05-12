package com.hk.app;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Exam113 {
	
	public static void main(String[] args) {
		
		String workpath = System.getProperty("user.dir");
	      
	    try {

	      // Creates a FileInputStream
	      FileInputStream file = new FileInputStream(workpath+"\\src\\text\\text113.txt");

	      // Creates a BufferedInputStream
	      BufferedInputStream input = new BufferedInputStream(file);

	      // Reads first byte from file
	      int i = input .read();

	      while (i != -1) {
	        System.out.print((char) i);

	        // Reads next byte from the file
	        i = input.read();
	      }
	      input.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
}
