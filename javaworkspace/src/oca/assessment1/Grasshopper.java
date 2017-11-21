package oca.assessment1;
/*
* 21-11-2017 : This class is part of assessment for OCA certification
* @author : Manasa Venkatesh
*/
/*
A. Immediately after line 9, no grasshopper objects are eligible for garbage collection.
B. Immediately after line 10, no grasshopper objects are eligible for garbage collection.
C. Immediately after line 9, only one grasshopper object is eligible for garbage collection.
D. Immediately after line 10, only one grasshopper object is eligible for garbage collection.
E. Immediately after line 11, only one grasshopper object is eligible for garbage collection.
F. The code compiles.
G. The code does not compile.
*/
/*C, D, F. Immediately after line 9, only Grasshopper g1 is eligible for garbage collection
since both one and two point to Grasshopper g2. Immediately after line 10, we still
only have Grasshopper g1 eligible for garbage collection. Reference one points to g1
and reference two is null. Immediately after line 11, both Grasshopper objects are eligible
for garbage collection since both one and two point to null. The code does compile.
Although it is traditional to declare instance variables early in the class, you don’t
have to. For more information, see Chapter 1.
*/
public class Grasshopper{
	public Grasshopper(String n){
		name = n;
	}

	public static void main(String[] args){
		Grasshopper one = new Grasshopper("g1");
		Grasshopper two = new Grasshopper("g2");

		one = two;
		two = null;
		one = null;
	}

	private String name;
}