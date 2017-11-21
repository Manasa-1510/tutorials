package oca.assessment1;
/*
* 21-11-2017 : This class is part of assessment for OCA certification
* @author : Manasa Venkatesh
*/
/*
A. Color:
B. Color:null
C. Color:White
D. Compiler error on line 4.
E. Compiler error on line 10.
F. Compiler error on line 11.
*/
/*
B. Line 10 calls the constructor on lines 22–25. That constructor calls the other constructor.
However, the constructor on lines 26–28 assigns the method parameter to itself,
which leaves the color instance variable on line 2 set to its default value of null. For
more information, see Chapter 4.
*/
public class Egret{
	private String color;
	public Egret(){
		this("white");
	}

	public Egret(String color){
		this.color = color;
	}

	public static void main(String[] args){

		Egret egret = new Egret();
		System.out.println("Color:" + egret.color);
	}
}