package oca.chapter4;

class Order {
	//static String result = "";
	String value = "t";

	{ value += "a"; }
	{ value += "c"; }

	public Order(){
		value += "b";
	}

	public Order(String s){
		value += s;
	}
	
	/*{ 
		System.out.println("Instance initializers");
		result += "c"; }
	static 
	{
		System.out.println("Static initializers");
		result += "u";
		result += "r";
	}*/
}


public class OrderDriver{
	public static void main(String[] args){

		Order order = new Order("f");
		order = new Order();
		System.out.println(order.value);

		/*System.out.println(Order.result + " ");
		System.out.println(Order.result + " ");
		new Order();
		new Order();
		System.out.println(Order.result + " ");*/
	}
}
