
/*
Varargs are to be placed as teh last parameter
*/package oca.mockTest;

public class Barn{
	public static void main(String[] args){
		new Barn.go("hi",1);
		new Barn.go("hi","world",2);
	}
	public void go(String...y,int x){
		System.out.println(y[y.length-1]+" ");
	}
}