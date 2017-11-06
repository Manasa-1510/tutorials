package com.practice.linkedlist;

import java.util.Scanner;

public class Linkedlist {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printList() {
		Node n = head;
		System.out.println("Data in the list");
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void pushFirst(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		return;
	}

	public void pushLast(int data) {
		Node n = new Node(data);
		n.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = n;
		return;
	}

	public void append(int location, int data) {
		Node n = new Node(data);
		n.next = null;
		Node last = head;
		Node prevNode = getNode(location);
		while (last.next != prevNode) {
			last = last.next;
		}
		n.next = last.next;
		last.next = n;

		return;
	}

	public Node getNode(int index) {	
		Node current = head;
		int size = 0;
		boolean flag = false;
		while (current != null) {
			if (size == index) {
				flag= true;
				break;
			}
			current = current.next;
			size++;
		}
		
		 if(flag==false && index>size){
			throw new IndexOutOfBoundsException();
		}
		return current;
	}
	
	public int getNodeData(int index) {	
		Node current = head;
		int size = 0;
		while (current != null) {
			if (size == index) return current.data;				
			current = current.next;
			size++;
		}		
		 if(index>size){
			throw new IndexOutOfBoundsException();
		}
		return 0;
	}

	public int length() {
		int size = 0;
		Node n = head;
		while (n != null) {
			n = n.next;
			size++;
		}

		return size;
	}
	
	public int recursiveCount(Node n){
		if(n == null){
			return 0;
		}else{
			return 1+recursiveCount(n.next);
		}
		
	}
	
	public int getCount(){
		return recursiveCount(head);
	}

	public void deleteFirstNode() {
		if(head!=null){
			Node n = head;
			head = n.next;
		}
		else{
			System.out.println("There are no elements to delete");
		}
		return;
		
	}
	
	public void deleteLastNode() {
		Node n = head;
		Node prev = null;
		if(head==null){
			System.out.println("There are no elements to delete");
		}
		while(n.next!=null){
			prev = n;
			n = n.next;
		}
		System.out.println(n.data);
		prev.next = null;
		return;
		
	}

	public void deleteNode(int key) {
		Node temp = head, prev = null;
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if (temp.next == null)
			return;

		prev.next = temp.next;

	}
	
	public void deleteNodeBasedOnPosition(int position) {
		Node temp = head, prev = null;
		int size = 0;
		while(temp!=null ){
			prev = temp;
			temp = temp.next;
			size++;
			if(size==position){
				prev.next = temp.next;
				break;
			}
		}
		
		
		/*if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}*/
		
		
	}
	public boolean searchNode(Node head,int data){
		Node current = head;
		while(current!=null){
			if(current.data == data)	
				return true;
				current = current.next;			
		}
		return false;
	}
	
	public boolean recSearchNode(Node head,int data){
		
		if(head==null)
			return false;
		
		if(head.data == data)
			return true;
		
		return recSearchNode(head.next, data);
		}
	
	
	public void clearList(){
		head = null;
	}
	
	public void deleteNodewith(Node head,Node n){
		if(head==n){
			if(head.next == null){
				System.out.println("There is only one element and hence we are not deleting any data" );
				return;
			}
			head.data = head.next.data;
			head = head.next;
			head.next = head.next.next;
			System.gc();
			return;
		}		
		Node current = head;
		Node prev = head;
		while(current!=null){
			if(current.data==n.data){
				prev.next = current.next;
				System.gc();
			}
			prev = current;
			current = current.next;
		}
		
	}
	
	public void deleteNode(Node node,Node n){
		if(node == n){
			if(node.next == null){
				System.out.println("No other elements to delete");
				return ;
			}
			node.data = node.next.data;
			n = node.next;
			node.next = node.next.next;
			System.gc();
			return;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Linkedlist linklist1 = new Linkedlist();
		linklist1.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);

		linklist1.head.next = second;
		second.next = third;
		/*System.out.println("Enter new node to be added at first");
		Scanner in = new Scanner(System.in);
		int data = in.nextInt();
		linklist1.pushFirst(data);
		linklist1.printList();
		System.out.println("Enter new node to be added at last");
		Scanner in_last = new Scanner(System.in);
		int last_data = in_last.nextInt();
		linklist1.pushLast(last_data);
		linklist1.printList();
		System.out.println("Enter the position where you want to add data");
		Scanner in_append = new Scanner(System.in);
		int append_pos = in_append.nextInt();
		System.out.println("Enter data");
		int appen_data = in_append.nextInt();
		linklist1.append(append_pos, appen_data);
		linklist1.printList();
		System.out.println("Enter location to find a node");
		int location = in_append.nextInt();
		Node tempNode = linklist1.getNode(location);
		System.out.println("Data at given location is " + tempNode.data);
		linklist1.printList();
		System.out.println("Delete first node " );
		linklist1.deleteFirstNode();
		linklist1.printList();
		System.out.println("Size of the list is" + linklist1.length());
		System.out.println("Delete first node " );
		System.out.println("Delete last node " );
		linklist1.deleteLastNode();
		linklist1.printList();
		System.out.println("Delete 2nd node " );
		linklist1.deleteNodeBasedOnPosition(2);
		linklist1.printList();
		System.out.println("Delete node with value 100 " );
		linklist1.deleteNode(100);
		linklist1.printList();
		System.out.println("Size of the list is" + linklist1.length());
		linklist1.clearList();
		System.out.println("Size of the list is" + linklist1.getCount());*/
		linklist1.printList();
		linklist1.deleteNode(head,head);
		linklist1.printList();
		linklist1.deleteFirstNode();
		linklist1.printList();
	}
	}


