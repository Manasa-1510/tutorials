package com.practice.code;

interface ParentTest {
	
	void test2();
}

class SimpleClass {
	
	void simple(){
		System.out.println("This is simple class");
	}
}

public class Hello {

	public static void main(String[] args){
		Test a = new Test(){
		public void test(){
			System.out.println("This is anonymous class!" + toString());
		}

	
	};
		a.test();
		

	}


	
	
}