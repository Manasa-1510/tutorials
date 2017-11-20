package OCA.Assessment1;
/*
* 20-11-2017 : This class is part of assessment for OCA certification SE8 Programmer 1 by Boyarsky Jeanne, Selikoff Scott
* @author : Manasa Venkatesh
*/
/*
A. 2
B. 4
C. The code will not compile because of line 31.
D. The code will not compile because of line 35.
E. The code will not compile because of line 37.
F. The code will not compile because of line 44.
G. The output cannot be determined from the code provided.
*/
/*C, D, E. First, the method getTailLength() in the interface HasTail is assumed to be
public, since it is part of an interface. The implementation of the method on line 3 is
therefore an invalid override, as protected is a more restrictive access modifier than
public, so option C is correct. Next, the class Cougar implements an overloaded version
of getTailLength(), but since the declaration in the parent class Puma is invalid,
it needs to implement a public version of the method. Since it does not, the declaration
of Puma is invalid, so option D is correct. Option E is incorrect, since Puma is marked
abstract and cannot be instantiated. The overloaded method on line 11 is declared
correctly, so option F is not correct. Finally, as the code has multiple compiler errors,
options A, B, and G can be eliminated.Refer Chapter 5 for more details */

interface HasTail { int getTailLength(int length); }

abstract class Puma implements HasTail{
	
	// The access modifier cannot be reduced from the level it is defined in parent class or inherited class
	//protected int getTailLength(){return 4;}
	public int getTailLength(){return 4;}
}

public class Cougar extends Puma {
	
	public static void main(String[] args){
		
		Puma p = new Puma();//Abstract class Puma cannot be instantiated
		/*Cougar p = new Cougar();
		int length = 5;		
		System.out.println(p.getTailLength(length)); //method overloading calls the child method
		System.out.println(p.getTailLength()); //method overloading calls parent method
*/
	}
	 
	public int getTailLength(int length){return 2;}

}