package com.practice.code;


import java.util.*

public class Swapnumber{
	
	public static void swapnumber(int a,int b){
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("The swapped numbers are a: " + a + "b: " + b);		
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers to be swapped");
		int a = s.nextInt();
		int b = s.nextInt();
		swapnumber(a,b);
	}
}