package com.hk.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exam063 {
	
	public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);

        System.out.println("Current Date and Time is: " + formatted);
    }

}
