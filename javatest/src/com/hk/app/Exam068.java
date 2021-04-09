package com.hk.app;

public class Exam068 {
	
	public static void main(String[] args) {

        String path = System.getProperty("user.dir");
        
        System.out.println("Working Directory = " + path);
        
        for(int i=0; i<5; i++) {
        	
        	for(int j=0; j<i+1; j++) {
        		
        		System.out.print(i+1);
        	}
        	System.out.println();
        }

    }

}
