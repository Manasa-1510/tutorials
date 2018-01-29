package ocaV2.chapter1.otherpackage;

public class OtherClass{
	protected static int x = 10;

	void testIt(){
		System.out.println("Default access");
	}

	protected static void testProtected(){
		System.out.println("Protected access");
	}

}