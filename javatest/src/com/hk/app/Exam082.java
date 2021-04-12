package com.hk.app;

public class Exam082 {
	
	public static void main(String[] args) {

        String string = "12345.15";
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
        
        // 정규식 사용한 방법
        String string2 = "-1234.15";
        boolean numeric2 = true;

        numeric2 = string2.matches("-?\\d+(\\.\\d+)?");

        if(numeric2)
            System.out.println(string2 + " is a number");
        else
            System.out.println(string2 + " is not a number");
    }

}
