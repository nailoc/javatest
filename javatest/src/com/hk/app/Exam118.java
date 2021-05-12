package com.hk.app;

import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Exam118 {
	
	public static void main(String[] args) {

	    try {

	      // Two absolute paths
	      File absolutePath1 = new File("d:\\temp\\java.txt");
	      System.out.println("Absolute Path1: " + absolutePath1);
	      File absolutePath2 = new File("d:\\temp");
	      System.out.println("Absolute Path2: " + absolutePath2);

	      // convert the absolute path to URI
	      URI path1 = absolutePath1.toURI();
	      URI path2 = absolutePath2.toURI();

	      // create a relative path from the two paths
	      URI relativePath = path2.relativize(path1);

	      // convert the URI to string
	      String path = relativePath.getPath();

	      System.out.println("Relative Path: " + path);


	    } catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
 
}
