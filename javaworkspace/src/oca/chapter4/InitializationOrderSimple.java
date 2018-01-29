package oca.chapter4;

public class InitializationOrderSimple{
	private String name = "hamster" ;
	{ System.out.println(name); }
	private static int count = 0;
	static { System.out.println(count); }
	static { count+=10; System.out.println(count); }
	public InitializationOrderSimple(String name){
		this.name = name;
		System.out.println("In constructor" + name);
	}
	
}