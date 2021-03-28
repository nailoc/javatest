package com.hk.app;

public class Exam052 {
	
	double real;
    double imag;

    public Exam052(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
    	Exam052 n1 = new Exam052(2.3, 4.5),
                n2 = new Exam052(3.4, 5.0),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static Exam052 add(Exam052 n1, Exam052 n2)
    {
    	Exam052 temp = new Exam052(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }

}
