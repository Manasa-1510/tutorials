package oca.chapter4;

import oca.chapter4.*;
import static oca.chapter4.Rope.*;

public class RopeSwing{
	private static Rope rope1 = new Rope();
	private static Rope rope2 = new Rope();
	{
		System.out.println(rope1.length);
	}

	public static long square(int x){
		long y = x * (long) x;
		x = -1;
		return y;
		
	}
	public static void main(String[] args){
		rope1.length = 2;
		rope2.length = 8;
		System.out.println(rope1.length);

		int value = 9;
		long result = square(value);
		System.out.println(result);
		System.out.println(value);

	}


}