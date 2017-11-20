package oca.assessment1;
/*
* 20-11-2017 : This class is part of assessment for OCA certification SE8 Programmer 1 by Boyarsky Jeanne, Selikoff Scott
* @author : Manasa Venkatesh
*/
/*
A. 10
B. 15
C. 25
D. Compiler error on line 3.
E. Compiler error on line 8.
F. None of the above.
*/
/*
B. The code compiles successfully, so options D and E are incorrect. The value of a
cannot be changed by the addToInt method, no matter what the method does, because
only a copy of the variable is passed into the parameter x. Therefore, a does not change
and the output on line 9 is 15. For more information, see Chapter 4.
*/

public class MathFunctions{
	
	public static void addToInt(int x, int amountToAdd){
			x = x + amountToAdd;			
	}

	public static void main(String[] args){
		int a = 15;
		int b = 10;
		MathFunctions.addToInt(a, b);
		System.out.println(a);

	}
}