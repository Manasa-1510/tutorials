/*
 * 2017-11-16: This class was created to practice basics of Java Programming
 *
 */

package com.practice.code;

import java.util.*;

/*
 * Addition is a class which supports add opertaion of numbers.
 *
 *@since 1.0
 */
public class Addition{
	/*
	*
	*/
	static void addNumbers(){
		int a=10,b=4,c=0;
		c=a+b;
		System.out.println("Sum of digits is : " + c);
	}
	
	static void addNumbersConsole(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any two numbers to be added");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a + b;
		System.out.println("Sum of entered digits is : " + c);
	}
	public static void main(String[] args){
		addNumbers();
		addNumbersConsole();
	}
}