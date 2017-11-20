/*
 * 2017-11-16: This class was created to practice basic java programming.
 */
package com.practice.code;

import java.util.*;
/*
 *This class swaps two numbers given by user.
 *
 */
public class Swapnumber{

/*
 *This method is to swap two numbers using a temporary variable
 *
 */
	public static void swapnumber(int a,int b){
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("The swapped numbers are a: " + a + "b: " + b);		
	}

/*
 *This method is to swap two numbers without using a temporary variable
 *
 */

	public static void swapnumbers(int a ,int b){
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The swapped numbers are a: " + a + " b: " + b);
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers to be swapped");
		System.out.println("Enter value of a");
		int a = s.nextInt();
		System.out.println("Enter value of b");
		int b = s.nextInt();
		swapnumbers(a,b);
	}
}