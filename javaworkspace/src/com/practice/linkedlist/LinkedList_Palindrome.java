package com.practice.linkedlist;
import java.util.*;

class Node{
		String data;
		Node next;
		Node (String d){
			data = d;
			next = null;
		}
	}

public class LinkedList_Palindrome{
	/**This method is to find if the string is palindrome by dividing string into two halves and comparing teh characters.**/
	Node head;

	static boolean isPalindromeString(String str){
		int length = str.length();
		for(int i=0;i<length/2;i++){
			if(str.charAt(i)!=str.charAt(-i-1))
				return false;
			
			
		}
		return true;
	}

	/**This method is to create a string from Linkedlist **/
	static boolean isPalindromeList(Node head){
		Node node = head;
		String str = "";
		if(node!=null){
			str = str.concat(node.data);
			node = node.next;
		}

		return isPalindromeString(str);
	}

	void printList(Node head){
		Node n = head;
		if(n!=null){
			while(n!=null){
				System.out.println(n.data);
				n = n.next;
			}
		}
	}

	public static void main(String[] args){
		LinkedList_Palindrome list = new LinkedList_Palindrome();
		list.head = new Node ("a");
		list.head.next = new Node("bc");
		list.head.next.next = new Node("cba");
		System.out.println("First List:");
		list.printList(list.head);

		LinkedList_Palindrome list2 = new LinkedList_Palindrome();
		list2.head = new Node ("d");
		list2.head.next = new Node("bc");
		list2.head.next.next = new Node("cbd");
		System.out.println("Second List:");
		list.printList(list2.head);
			if(isPalindromeList(list.head)){
				System.out.println("This is Palindrome");
			}else{
				System.out.println("Not a Palindrome");
			}
			
	}
}
