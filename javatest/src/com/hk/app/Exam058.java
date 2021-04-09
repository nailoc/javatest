package com.hk.app;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exam058 {
	
	public static void main(String[] args) {
        double num = 1.34567;
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(num));
    }

}
