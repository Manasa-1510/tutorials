package oca.chapter4;

public class Rope{
	public static int LENGTH = 5;
	static{
		LENGTH = 10;
	}

	public static int length = 0;
	public static void swing(){
		System.out.println("Swing");
	}

	public static void climb(){
		System.out.println("Climb");
	}

	public static void play(){
		swing();
		climb();
	}

	public static void main(String[] args){
		Rope rope = new Rope();
		rope.play();
		Rope rope2 = null;
		rope2.play();
	}
}