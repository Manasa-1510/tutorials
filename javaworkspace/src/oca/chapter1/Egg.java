package oca.chapter1;
/*
* 22-11-2017 : This class is part of chapter1, page 20 of oca certification by Boyarsky Jeanne, Selikoff Scott
* @author : Manasa Venkatesh
*/
public class Egg{
	
	public Egg(){
		number = 5;
		System.out.println("constructor block" + number );

	}

	public static void main(String[] args){	
		Egg egg = new Egg();
		System.out.println(egg.number);	
	}

	private int number = 3;
	
	{	System.out.println("Initialization after declaration block" + number );
		number = 4;
		System.out.println("intialization end block" + number );
	}
}