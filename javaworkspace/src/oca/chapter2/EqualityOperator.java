package oca.chapter2;

public class EqualityOperator{
	
	public static void main(String[] args){
		//valid
		boolean x = (true == false);

	//	boolean x = false != "Giraffe"; incompatible types

		boolean r = (3 == 3);
		System.out.println( x +" "+ r);

		int y = 1;
		int z = 1;
		final int g = y<10 ? y++ : z++;
		System.out.println(y+","+z);
		 int h = y<=10 ? y++ : z++;
		 System.out.println(y+","+z);
		 int k = y>10 ? y++ : z++;
		 System.out.println("y>10 ? y++ : z++" + y+","+z);
		 int j = y>=10 ? y++ : z++;
		 System.out.println("y>=10 ? y++ : z++;" + y+","+z);

	}	
}