package oca.chapter1;
/*
* 22-11-2017 : This class is part of chapter1, page 19 of oca certification by Boyarsky Jeanne, Selikoff Scott
* @author : Manasa Venkatesh
*/
public class Chick {

	private String name = "Fluffy";
	
	{ System.out.println("Setting field"); } //instance initializer

	public Chick(){
		name = "Tiny";
		System.out.println("Setting constructor");
	}

	public static void main(String... args){
		Chick chick = new Chick();
		System.out.println(chick.name);
	}
}