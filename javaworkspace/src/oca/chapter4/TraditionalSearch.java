package oca.chapter4;

import java.util.*;
public class TraditionalSearch{

	public static void main(String[ ] args){
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("kangroo",true,false));
		animals.add(new Animal("fish",false,true));
		animals.add(new Animal("rabbit",true,false));
		animals.add(new Animal("dog",true,true));
		System.out.println(animals.size());
		print(animals, new CheckIfHopper());
	}

	private static void print(List<Animal> animals,CheckTrait check){
		for(Animal a:animals){
			System.out.println(a.toString());
			if(check.test(a)){
				System.out.println(a + " ");
			}
		}
		System.out.println();
	}
	
}