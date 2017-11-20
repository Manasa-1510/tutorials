package com.practice.code;

class Singleton{
	private int counter;
	private final  Singleton instance = new Singleton();

	private Singleton(){
		
	}

	public int increment(){
		return ++this.counter;
	}

	public static Singleton getInstance(){
		return instance;
	}

	public static void main(String[] args){
		
		System.out.println(Singleton.getInstance().increment());
		System.out.println(Singleton.getInstance().increment());

	}
}