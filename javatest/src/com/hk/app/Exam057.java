package com.hk.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exam057 {
	
	 public static void main(String[] args) {
	        // Format y-M-d or yyyy-MM-d
	        String string = "2017-07-25";
	        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

	        System.out.println(date);
	    }

}
