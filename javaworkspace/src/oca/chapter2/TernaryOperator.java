package oca.chapter2;

public class TernaryOperator{
	public static void main(String[] args){
		int x = 5;
		System.out.println( x > 2 ? x < 4 ? 10 : 8 : 7);

		String message = x > 10 ? "Greater than" : "less than";

		boolean h = true,z = true;
		int y = 20;
		h = (y!=10)^(z=false);
		System.out.println(h + ", " + y + ", " + z);

		
	}
}