package com.hk.app;

public class Exam037 {
	
	public static void main(String[] args) {
		long num = 110110111;
		int decimal = convertBinaryToDecimal(num);
		System.out.printf("%d in binary = %d in decimal", num, decimal);
		
		int num2 = 19;
		long binary = convertDecimalToBinary(num2);
		System.out.printf("%d in decimal = %d in binary", num2, binary);
	}

	public static int convertBinaryToDecimal(long num)
	{
		int decimalNumber = 0, i = 0;
		long remainder;
		while (num != 0)
		{
			remainder = num % 10;
			num /= 10;
			decimalNumber += remainder * Math.pow(2, i);
			++i;
		}
		return decimalNumber;
	}

	public static long convertDecimalToBinary(int n)
	{
		long binaryNumber = 0;
		int remainder, i = 1, step = 1;

		while (n!=0)
		{
			remainder = n % 2;
			System.out.printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n/2);
			n /= 2;
			binaryNumber += remainder * i;
			i *= 10;
		}
		return binaryNumber;
	}

}
