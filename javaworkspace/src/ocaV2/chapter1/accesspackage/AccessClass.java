package ocaV2.chapter1.accesspackage;

import ocaV2.chapter1.otherpackage.*;

public class AccessClass extends OtherClass{
	public static void main(String[] args){
		OtherClass o = new OtherClass();
		testProtected();//Although it is protected accessible as there is no dot  since 
		System.out.println("value of x" + x);
		//o.testIt();//not accessible as it is defaul access in other package
		//o.testProtected();//not accessible as it is protected access and Dot is used in other package
	}
}