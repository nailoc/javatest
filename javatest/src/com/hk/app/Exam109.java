package com.hk.app;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Exam109 {
	
	public static void main(String args[]) {

	    // Creates a string
	    String name = "Programiz";
	    System.out.println("String is: " + name);

	    try {

	      InputStream stream = new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
	      System.out.println("InputStream: " + stream);

	      // Returns the available number of bytes
	      System.out.println("Available bytes at the beginning: " + stream.available());

	      // Reads 3 bytes from the stream stream
	      stream.read();
	      stream.read();
	      stream.read();

	      // After reading 3 bytes
	      // Returns the available number of bytes
	      System.out.println("Available bytes at the end: " + stream.available());

	      stream.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
	

}
