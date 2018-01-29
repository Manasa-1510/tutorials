package oca.chapter3;

import java.util.*;
public class Fish{
	
	public static void main(String[] args){
		String s = "Hello";
		String t = new String(s);
		if("Hello".equals(s)) System.out.println("one");
		if( t == s) System.out.println("two");
		if(t.equals(s)) System.out.println("three");
		 if ("Hello" == s) System.out.println("four");
	if ("Hello" == t) System.out.println("five");
	StringBuilder sb = new StringBuilder();
	sb.append("aaa").insert(1, "bb").insert(4, "ccc");
 	System.out.println(sb);

 	String s1 = "java";
 	StringBuilder s2 = new StringBuilder("java");
 	//if(s1 == s2 ) System.out.println("1");//cannot compare different objects
 	if(s1.equals(s2)) {
	 	System.out.println("2");
	}else{
		System.out.println("no comparision");
	}

	String letters = "abcdef";
	System.out.println(letters.length());
	System.out.println(letters.charAt(3));
	//System.out.println(letters.charAt(6));//out of index exception

	String numbers = "012345678";
	System.out.println(numbers.substring(1, 3));
	System.out.println(numbers.substring(7, 7));//prints empty as start and end is same
	System.out.println(numbers.substring(7));//only start index is given

	String a = "";
	 a += 2;
	 a += 'c';
	 a += false;
	if ( a == "2cfalse") System.out.println("==");
	if ( a.equals("2cfalse")) System.out.println("equals");//equals to is compared

	int total = 0;
	StringBuilder lettersNew = new StringBuilder("abcdefg");
	total += letters.substring(1, 2).length();
	total += letters.substring(6, 6).length();
	//total += letters.substring(6, 5).length();//Index out of bound exception
	System.out.println(total);


	StringBuilder numberss = new StringBuilder("0123456789");
	numberss.delete(2, 8);
	numberss.append("-").insert(2, "+");
	System.out.println(numberss);
	//StringBuilder b = "rumble";//compiler error

	StringBuilder puzzle = new StringBuilder("Java");
	// INSERT CODE HERE
	puzzle.reverse();
	System.out.println("one" + puzzle);
	puzzle.append("vaJ$").delete(0,3).deleteCharAt(puzzle.length()-1);
	System.out.println("two" + puzzle);
	// puzzle.append("vaJ$").delete(0,3).deleteCharAt(puzzle.length());//exceptionString index out of bound
	System.out.println("three" + puzzle);
	puzzle.append("vaJ$").substring(0, 4);
	System.out.println("four" + puzzle);

	List<String> hex = Arrays.asList("30", "8", "3A", "FF","4F");
	Collections.sort(hex);
	
	for(String value : hex){
		System.out.println(value);
	}

	int x = Collections.binarySearch(hex, "8");
	int y = Collections.binarySearch(hex, "3A");
	int z = Collections.binarySearch(hex, "4F");
	System.out.println(x + " " + y + " " + z);
	
}}