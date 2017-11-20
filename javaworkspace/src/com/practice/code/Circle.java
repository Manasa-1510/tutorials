/*
 * 2017-11-17 : This class was created to practice basic java programming.
 */
 package com.practice.code;

 import java.util.*;

 public class Circle{

 	public static void getArea(double radius){
 		Double area = Math.PI * (radius * radius) ;
 		System.out.println("Area of circle is : " + area);
 	}

 	public static void getCircumference(double radius){
 		Double circumference = Math.PI * (2 * radius) ;
 		System.out.println("Circumference of circle is : " + circumference);
 	} 	

 	public static void main(String[] args){
 		Scanner s = new Scanner(System.in);
 		System.out.println("Enter the radius of circle");
 		Double radius = s.nextDouble();
 		getArea(radius);
 		getCircumference(radius);
 	}
 }