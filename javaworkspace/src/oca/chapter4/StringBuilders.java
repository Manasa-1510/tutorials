package oca.chapter4;

public class StringBuilders {
	
	public static StringBuilder work(StringBuilder a,StringBuilder b){
		a = new StringBuilder("a");
		b.append("b");
		return a;
	}

	public static void main(String[] args){
		StringBuilder s1 = new StringBuilder("S1");
		StringBuilder s2 = new StringBuilder("S2");
		StringBuilder s3 = work(s1,s2);

		System.out.println("s1 =" + s1);
		System.out.println("s2 =" + s2);
		System.out.println("s3 =" + s3);
	}

}