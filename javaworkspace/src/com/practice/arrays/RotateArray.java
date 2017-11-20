package com.practice.arrays;

public class RotateArray {

	/**
	 * @param args
	 */
	void leftRotate(int arr[],int d,int n){
		int i;
		for(i=0;i<d;i++){
		rotateByOne(arr,n);
		}

	}

	void rotateByOne(int arr[],int n){
		int i,temp;
		temp = arr[0];
        for (i = 0; i < n - 1; i++)
         {
         	 arr[i] = arr[i + 1];
         }  
        	arr[i] = temp;
	}

	void printArray(int arr[]){
		for(int i :arr){
			System.out.println(i);
		}
	}

	int gcd(int m,int n){
		if(n==0){
			return m;
		}else{
			return gcd(n,m%n);
		}
	}
	void jugglingRotate(){
		
	}
	
	public static void main(String[] args) {
		RotateArray rotateArray = new RotateArray();
		int arr[] = {1, 2, 3};
        rotateArray.leftRotate(arr, 2, 3);
        rotateArray.printArray(arr);
	}

}
