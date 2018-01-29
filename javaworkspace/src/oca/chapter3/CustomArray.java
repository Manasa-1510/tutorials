package oca.chapter3;

import java.util.ArrayList;

public class CustomArray{
	int size = 4;

	class Data{
		int id;
		String name;
		long phone;

		Data(int id,String name,long phone){
			this.id = id;
			this.name = name;
			this.phone = phone;
		}
	}

	public static void main(String[] args){
   
		String name[] = {"A", "B", "C", "D"};
        int id[] = {1, 2, 3, 4};
        long phone[] = {8762357381L, 8762357382L, 8762357383L,
                        8762357384L };
        CustomArray customArray = new CustomArray(); 

        customArray.addValues(id,name,phone);
	}

	public void addValues(int id[], String name[],long phone[]){
		
		System.out.println("Size of array" + size);
		ArrayList<Data> list = new ArrayList<>();
		for(int i = 0; i < size; i++){
			list.add(new Data(id[i],name[i],phone[i]));
		}

		printValues(list);
	}


	public void printValues(ArrayList<Data> list){

		for(int i = 0; i < size; i++){
			Data data = list.get(i);
			System.out.println(data.id + " " + data.name + " " + data.phone);
		}
		
	}
}