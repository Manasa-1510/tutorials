package oca.mockTest;

import java.lang.Object;
import java.util.List;
import java.util.ArrayList;
import java.lang.Throwable;
public class ArrayTest{

	public static void main(String[] args){
	int[] sample = new int[5];
	if(sample instanceof Object){
		System.out.println("Sample is an object");
	}else{
		System.out.println("Sample is not an object");
	}

	int[][] array2D = new int[3][2];
	int count = 0;
	for(int i = 0; i < array2D.length;i++){
		
		for(int j = 0; j < array2D[i].length;j++){
			++count;
			System.out.println(" i -> "+ i + " j -> " + j+"count " + count);
		}
	}
	System.out.println(array2D.length);
   System.out.println("count" + count);

   List test = new ArrayList();
   test.add("Hi");
   System.out.println(test.get(0));
   //System.out.println("abc".charAt(3));//Index out of bound index starts from 0
 	float f = math(3);
   int x=1;
   for(int a = 5;x < a; a--){
   	System.out.println(a);
   }
   try{
   	switch(Integer.parseInt(args[0])){
   		case 1: throw new IllegalStateException();
   		case 2: throw  new IllegalArgumentException();
   		case 3: throw new RuntimeException();
   	}}finally{}
   }

   static int math(final int y){
   		y/=2;
   		return y;
   }
}
