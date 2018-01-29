package ocaV2.chapter1.accesspackage;

import ocaV2.chapter1.otherpackage.*;
public class SomeClass {
	
	public static void main(String[] args){
		AccessClass access = new AccessClass();
		System.out.println("value of x" + access.x);
	}
	

}