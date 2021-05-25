package ch03;

import java.util.*;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public double area(int r) {
		return Math.PI*r*r;
	}
	public double length(int r) {
		return 2*Math.PI*r;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(1, 2));
		System.out.println(cal.sub(1, 2));
		System.out.println(cal.mul(2, 3));
		System.out.println(cal.div(4, 2));
		
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		
		System.out.printf("%.6f\n",cal.area(input));
		System.out.printf("%.6f\n",cal.length(input));
	}
}	
