/*
 * 2017-11-16: This class was created to practice basic java programming.
 */
package com.practice.code;

import java.util.*;

/*
 *This class prints if a number is odd or even
 *
 */

public class Oddeven{

	static void findOddOrEven(int no){
		if(no%2 == 0){
			System.out.println(no + "This is an even number");
		}			
		else{
			System.out.println(no + "This is an odd number");
		}
	}
	
	public static void main(String[] args){
		System.out.println("Enter a number to find out if it is odd or even");
		Sanner s = new Scanner(System.in);
		int no = nextInt();
		findOddOrEven(no);			
		
	}
}
