/*
 * 2017-11-17 : This class was created to practice basic java programming.
 */
package com.practice.code;

import java.util.*;

public class StringConversion{
	
	public static void main(String[] args){
		int i = 12;
		Double d = 34.85;
		Float f = 20.6f;
		Boolean b = false;
		Integer data = new Integer(87);
		System.out.println ("String value of int " + i + " is : " + String.valueOf(i));
		System.out.println ("String value of double " + d + " is : " + String.valueOf(d));
		System.out.println ("String value of float " + f + " is : " + String.valueOf(f));
		System.out.println ("String value of boolean " + b + " is : " + String.valueOf(b));
		System.out.println ("String value of integer " + data + " is : "+ Integer.toString(data));
	}
}