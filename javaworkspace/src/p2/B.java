package p2;

public class A{
	private void display(){
		System.out.println("Class A display");
	}

	protected void show(){
		System.out.println(" Protected member method ");
	}

}

public class B{
	
	public static void main(String[] args){
		//This code will display compiler error as obj.display() is defiend as private
		/*A obj = new A();
		obj.display();
		*/

		A obj1 = new A();
		obj1.show();
	}
}