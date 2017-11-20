package oca.assessment1;
/*
* 20-11-2017 : This class is part of assessment for OCA certification SE8 Programmer 1 by Boyarsky Jeanne, Selikoff Scott
* @author : Manasa Venkatesh
*/
/*A. abe
B. abce
C. abde
D. abcde
E. The code does not compile.
F. An uncaught exception is thrown.
*/
/*D. The code starts running and prints a and b on lines 13 and 15. Line 16 throws an
exception, which is caught on line 17. After line 18 prints c, the finally block is run
and d is printed. Then the try statement ends and e is printed on line 22. For more
information, see Chapter 6.*/
class ExceptionSample{
	public static void main(String[] args){
		System.out.println("a");
		try{
			System.out.println("b");
			throw new IllegalArgumentException();
		}catch(RuntimeException e){
			System.out.println("c");
		}finally{
			System.out.println("d");
		}
		System.out.println("e");
	}
}