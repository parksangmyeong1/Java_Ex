package ch03;

import java.util.*;

public class Calculator {
	public long add(int num1, int num2) {
		return num1+num2;
	}
	public long sub(int num1, int num2) {
		return num1-num2;
	}
	public long mul(int num1, int num2) {
		return num1*num2;
	}
	public long div(int num1, int num2) {
		return num1/num2;
	}
	public double area(double r) {
		return Math.PI*r*r;
	}
	public double length(double r) {
		return 2*Math.PI*r;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(1, 2));
		System.out.println(cal.sub(1, 2));
		System.out.println(cal.mul(2, 3));
		System.out.println(cal.div(4, 2));
		
		Scanner s = new Scanner(System.in);
		double input = s.nextDouble();
		
		System.out.printf("%.6f\n",cal.area(input));
		System.out.printf("%.6f\n",cal.length(input));
	}
	
}	
