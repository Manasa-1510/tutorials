/*
 * 2017-11-17 : This class was created to practice basic java programming.
 */
package com.practice.code;

import java.util.*;
/*
 *This class implements method to find area square
 *
 */

public class SquareArea{

	public static void findAreaSqaure(int side){
		int squareArea = side * side;
		System.out.println("The area of the square is : " + squareArea);
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the side of square");
		double side = s.nextDouble();
		findAreaSqaure(area);
	}
}