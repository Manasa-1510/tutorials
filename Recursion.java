package com.practice.recursion;

public class Recursion {

	
	public int fact(int n){
		if(n==0)
		return 1;
		else
			return fact(n*n-1);
	}
	
	public static int tailFact(int n ){
		 return factTR(n,1);
	}
	 
	public static int factTR(int n,int a){
		if(n==0) return a;
		else
			System.out.println("a"+a);
		System.out.println("n"+n);

			return factTR(n-1,n*a);
	}
	
	static int fun1(int x, int y){
		if(x==0) return y;
		else
		return	fun1(x-1,x+y);
	}
	public static void main(String[] args) {
		System.out.println("Factorial Program");
		//int result = tailFact(4);
		
		//System.out.println(result);
		
		int new_result = fun1(5,6);
		System.out.println(new_result);
	}

}
