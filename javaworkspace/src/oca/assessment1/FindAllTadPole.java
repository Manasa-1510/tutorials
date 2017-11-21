package oca.assessment1;
/*
* 21-11-2017 : This class is part of assessment for OCA certification
* @author : Manasa Venkatesh
*/
/*
A. CanSwim
B. Long
C. Amphibian
D. Tadpole
E. Object
*/
/*
A, C, E. The for-each loop automatically casts each Tadpole object to an Amphibian
reference, which does not require an explicit cast because Tadpole is a subclass of
Amphibian. From there, any parent class or interface that Amphibian inherits from is
permitted without an explicit cast. This includes CanSwim, the interface Amphibian
implements, and Object, which all classes extend from, so options A and E are correct.
Option C is also correct since the reference is being cast to the same type, so no explicit
cast is required. Option B is incorrect, since Long is not a parent of Amphibian. Option
D is incorrect as well, although an explicit cast to Tadpole on the right-hand side of the
expression would be required to allow the code to compile. For more information, see
Chapter 5.
*/
interface CanSwim{ }

class Amphibian implements CanSwim{

	public void getTadpole(){ 	
 	System.out.println("Amphibian method"); 
	}
 }

class Tadpole extends Amphibian { 

 public void getTadpole(){
 	System.out.println("Tadpole method");
 }

}

public class FindAllTadPole {

	public static void main(String[] args){
		
		java.util.List<Amphibian> amphibians = new java.util.ArrayList<Amphibian>();
		Amphibian amphi = new Amphibian();
		amphibians.add(amphi);
		for(Amphibian amphibian : amphibians){
			/*Tadpole tadpole = (Tadpole)amphibian;
			tadpole.getTadpole();*/
			Amphibian a = amphibian;
			a.getTadpole();
			CanSwim b = amphibian;
			//b.getTadpole();


		}
	}
}