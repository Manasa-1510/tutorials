package oca.assessment1;
/*
* 20-11-2017 : This class is part of assessment for OCA certification
* @author : Manasa Venkatesh
*/
/*
A. DeerReindeer,false
B. DeerReindeer,true
C. ReindeerDeer,false
D. ReindeerDeer,true
E. DeerAgeReindeer,false
F. DeerAgeReindeer,true
G. The code will not compile because of line 7.
H. The code will not compile because of line 12.
*/
/*
A. The code compiles and runs without issue, so options G and H are incorrect. First,
the Reindeer object is instantiated using the constructor that takes an int value. Since
there is no explicit call to the parent constructor, the default no-argument super()
is inserted as the first line of the constructor. The output is then Deer, followed by
Reindeer in the child constructor, so only options A and B can be correct. Next,
the method hasHorns() looks like an overridden method, but it is actually a hidden
method since it is declared private in the parent class. Because the hidden method is
referenced in the parent class, the parent version is used, so the code outputs false,
and option A is the correct answer.
*/
public class Deer {
	public Deer() { System.out.println("Deer"); }
	public Deer(int age) { System.out.println("DeerAge"); }
	private boolean hasHorns() { return false;} //This method is always called when the refrence belongs to parent
  //public boolean hasHorns() { return false;} //This method can be called from teh child class as it is public
	public static void main(String[] args){
		Deer deer = new Reindeer(5);
		System.out.println("," + deer.hasHorns());
	} 	
}

class Reindeer extends Deer{
		public Reindeer(int age) { System.out.println("Reindeer"); }
		public boolean hasHorns() { return true; }
	}
