package com.hk.app;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Exam112 {
	
	public static void main(String args[]) {

		String workpath = System.getProperty("user.dir");
		
	    // creates a multiline string using + operator
	    // the string is a Java Program
	    String program = "package com.hk.app; class JavaFile { " +
	                       "public static void main(String[] args) { " +
	                         "System.out.println(\"This is file\");"+
	                       "}"+
	                     "}";
	     try {
	       // Creates a Writer using FileWriter
	       FileWriter output = new FileWriter(workpath+"\\src\\com\\hk\\app\\JavaFile.java");

	       // Writes the program to file
	       output.write(program);
	       System.out.println("Data is written to the file.");

	       // Closes the writer
	       output.close();
	     }
	     catch (Exception e) {
	       e.getStackTrace();
	     }
	  }
}
