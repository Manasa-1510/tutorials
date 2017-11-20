package p1;
import p2.*;

public class C extends A{

	public void sample(){
		System.out.println("Child class member");
	}
	
	public static void main(String[] args){
		C obj = new C();
		obj.show();

		A obj2 = new C();
		obj2.sample();

//compiler error as protected method is not accessible.
		/*A obj1 = new C();
		obj1.show();*/
	}
}