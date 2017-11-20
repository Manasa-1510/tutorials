/*
 * 2017-11-17 : This class was created to practice basic java programming.
 */
 package com.practice.code;

 import java.util.*;

 /*
 *This class implements that conevrts date.
 */

 public class DaysConversion{
 
 /*
  *This method converts given number of days to months and days .
  *Each month is made up of 30 days.
  *
  */
 	public static void convertDaysToMonth(int n){
 		int month = n/30;
 		int days = n%30;
 		System.out.println("The days entered are equal to " + month + " months and " + days + " days");
 	}

 	public static void main(String[] args){
 		System.out.println("Enter number of days to see how many months it makes");
 		Scanner s = new Scanner(System.in);
 		int number = s.nextInt();
 		convertDaysToMonth(number);
 	}
 }