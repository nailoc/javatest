package com.hk.app;

public class Exam031 {

	public static void main(String[] args) {
		int number = 60;

		System.out.print("Factors of " + number + " are: ");

		// loop runs from 1 to 60
		for (int i = 1; i <= number; ++i) {

		  // if number is divided by i
		  // i is the factor
		  if (number % i == 0) {
			System.out.print(i + " ");
		  }
		}
	}

}
