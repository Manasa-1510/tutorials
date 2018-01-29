package oca.chapter5;

public class Lemur extends Primate implements HasTail{
	public boolean isTailStripped(){
		return false;
	}
	public int age = 10;
	public static void main(String[] args){
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		System.out.println(lemur.hasHair());
		HasTail hasTail = lemur;
		System.out.println(lemur.tail);
		System.out.println(hasTail.isTailStripped());
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		System.out.println(hasTail.tail);
		System.out.println(lemur.tail);
	}
}