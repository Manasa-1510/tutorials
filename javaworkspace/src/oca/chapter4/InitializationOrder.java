package oca.chapter4;

public class InitializationOrder{
	private String name = "Bugsy" ;
	{ System.out.println(name); }
	private static int count = 0;
	static { System.out.println(count); }
	{ count++ ; System.out.println(count); }
	public InitializationOrder(){
		System.out.println("In constructor");
	}

	public static void main(String[] args){
		System.out.println("Read to constructor");
		new InitializationOrder();
	}
}