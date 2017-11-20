/*
 * 2017-11-17 : This class was created to practice basic java programming.
 */
 package com.practice.code;

 import java.util.*;

 public class Circle{

 	public static void getCircumference(double radius){
 		Double area = Math.PI * (radius * radius) ;
 		System.out.println("The circumference of a circle is : " + circumference);
 	}
 	
 	public static void main(String[] args){
 		Scanner s = new Scanner(System.in);
 		System.out.println("Enter the radius of circle");
 		Double radius = s.nextDouble();
 		getCircumference(radius);
 	}
 }