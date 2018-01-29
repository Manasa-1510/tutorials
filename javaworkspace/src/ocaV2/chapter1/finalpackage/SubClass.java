package ocaV2.chapter1.finalpackage;

public class SubClass extends SuperClass{
	
	public static void show( final int x, final int y){
		x = x*y;//error trying to change final variable
		System.out.println(x);
	}

	//final method being tried to override
	public void showSample(){
		System.out.println("Overriding final method fails");
	}

	public static void main(String[] args){
		show(4,3);
	}
}