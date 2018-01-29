package ocaV2.chapter1.otherpackage;

public class AccessClass extends OtherClass{
	public static void main(String[] args){
		OtherClass o = new OtherClass();
		//o.testIt();
		o.testProtected();
		o.testIt();
	}
}