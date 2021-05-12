package com.hk.app;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Exam111 {
	
	public static void main(String args[]) {

	    try {

	      // file input.txt is loaded as input stream
	      // input.txt file contains:
	      // This is a content of the file input.txt
	      String workpath = System.getProperty("user.dir");
	      InputStream input = new FileInputStream(workpath+"\\src\\text\\text111.txt");

	      System.out.println("Data in the file: ");

	      // Reads the first byte
	      int i = input.read();

	      while(i != -1) {
	        System.out.print((char)i);

	        // Reads next byte from the file
	        i = input.read();
	      }
	      input.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  }
}
