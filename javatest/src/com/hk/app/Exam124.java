package com.hk.app;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//class is declared final
final class Immutable {

	// private class members
	private String name;
	private int date;
	
	Immutable(String name, int date) {
	
	 // class members are initialized using constructor
	 this.name = name;
	 this.date = date;
	}
	
	// getter method returns the copy of class members
	public String getName() {
	 return name;
	}
	
	public int getDate() {
	 return date;
	}

}


public class Exam124 {
	
	public static void main(String[] args) {

	    // create object of Immutable
	    Immutable obj = new Immutable("Programiz", 2011);

	    System.out.println("Name: " + obj.getName());
	    System.out.println("Date: " + obj.getDate());
	  }
}
