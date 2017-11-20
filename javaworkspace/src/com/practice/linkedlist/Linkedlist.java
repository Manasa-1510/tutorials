package com.practice.linkedlist;

import java.util.*;
public class Linkedlist {
	 Node head;

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
	
	public void recDelete(int k,Node n,int cur){
		 if(k==1){
			 head = n.next ;
			 n = null;
		 }
		 else if( k == cur+1 && n.next!=null){
			Node temp = n.next;			
			if( n.next.next!=null){
				n.next = n.next.next;
			}else{
				n.next = null;
			}
			temp = null;
		}
		 else recDelete(k, n.next, cur+1);
	}
	
	
	public void printReverseList(Node n){
		if(n==null) return;
		printReverseList(n.next) ;
		System.out.println(n.data);
	}     
	
	void swapNode(int x,int y){
		if(x==y)
		return ;	
		
		Node prevX = null,currX = head;
		printList();
		while(currX!=null && currX.data!=x){
			prevX = currX;
			currX = currX.next;
		}	

		Node prevY = null,currY = head;
		while(currY!=null&& currY.data!=y){
			prevY = currY;
			currY = currY.next;	
		}
		

		if(currX==null ||currY==null)
		return;

		if(prevX!=null)
		{	
			prevX.next = currY;
		}
		else
		{
			head = currY;
		}
		
		if(prevY!=null)
		{	prevY.next = currX;
		}
		else
		{ 
			head = currX;
		}
		System.out.println("currentX "+currX.data + "Current Y"+currY.data);
		printList();

		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;

		System.out.println("currentX "+currX.data + "Current Y"+currY.data);
	}          
	public void printMiddle(){
		Node slw_pnt = head;
		Node fast_pnt = head;
		if(head!=null){
			while (fast_pnt!=null && fast_pnt.next!=null){
				fast_pnt = fast_pnt.next.next;
				slw_pnt = slw_pnt.next;
			}
			System.out.println("Data @ the middle of list is :"+slw_pnt.data);
		}

	}
	public void swapNodesSample(int x, int y)
    {
        // Nothing to do if x and y are same
        if (x == y) return;
 
        // Search for x (keep track of prevX and CurrX)
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x)
        {
            prevX = currX;
            currX = currX.next;
        }
 
        // Search for y (keep track of prevY and currY)
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }
 
        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;
 
        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;
 
        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;
 
        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }     
    
    public int countRepeat(int search_data){
    	Node current = head;
    	int count = 0;
    	while(current!=null){
    		if(current.data == search_data){
    			count++;
    		}
    		current=current.next;
    	}
    	System.out.println("Data repeated :"+count);
    	return count;
    }            

    public int detectLoopByFloyd(){
    	Node slw_pnt = head,fast_pnt = head;
    	if(head!=null){
    		while(fast_pnt!=null && fast_pnt.next!=null){
    			slw_pnt = slw_pnt.next;
    			fast_pnt = fast_pnt.next.next;
    			System.out.println("slw_pnt.data"+slw_pnt.data);
    			System.out.println("fast_pnt.data"+fast_pnt.data);
    			if(slw_pnt == fast_pnt){
    				System.out.println("Found Loop");
    				return 1;
    			}
    		}
    	}
    	return 0;
    }

    static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null)
        {
            
            if (s.contains(h))
                return true;
            s.add(h);   
            h = h.next;
        }
   
        return false;
    }

    /*void moveNode(Node dest,Node src){
    	
    	Node newNode = src;
    	if(newNode!=null){
    		src = newNode.next;
    		newNode.next = dest;
    		dest = newNode;
    	}
    }*/

   /* public Node mergeSortNode(Node x,Node y){
    	Node temp ;
    	Node tail = temp;
    	temp.next = null;

    	while(1){
    		if(x==null){
    			tail.next = y;
    			break;
    		}else(y==null){
    			tail.next = x;
    			break;
    		}
    		if(x.data<=y.data)
    			moveNode(tail.next,x);
    		else
    			moveNode(tail.next,y);

    			tail = tail.next;
    	}
    	return dummy.next;
    }*/

	  static  Node mergeList(Node list1, Node list2) {
	  if (list1 == null) return list2;
	  if (list2 == null) return list1;

	  if (list1.data < list2.data) {
	  	System.out.println(list1.data);
	    list1.next = mergeList(list1.next, list2);
	    return list1;
	  } else {
	  	System.out.println(list2.data);
	    list2.next = mergeList(list2.next, list1);
	    return list2;
	  }
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Linkedlist linklist1 = new Linkedlist();
		linklist1.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);
		Node fourth = new Node(400);
		linklist1.head.next = second;
		second.next = third;
		third.next = fourth;*/
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
		/*linklist1.printList();
		linklist1.deleteNode(head,head);
		linklist1.printList();
		linklist1.deleteFirstNode();*/
		//linklist1.printList();
		//linklist1.recDelete(5, head, 1);
		//System.out.println("Reverse List");
		//linklist1.printReverseList(head);

	//	linklist1.swapNodesSample(200,400);
		//linklist1.printList();
		//linklist1.printMiddle();
	//	linklist1.countRepeat(100);
		Linkedlist llist = new Linkedlist();
 		
        llist.pushFirst(4);
        llist.pushFirst(5);
        


        Linkedlist llist2 = new Linkedlist();
 		


        llist.printList();
        llist2.printList();
       
     	
     	Node newNode = mergeList(llist.head,llist2.head);

     	System.out.println("Sorted data :");
     	while(newNode.next!=null){
     		System.out.println( newNode.data);
     		newNode =newNode.next;
     	}
       //  llist.head.next.next.next.next = llist.head;
       /*  llist.detectLoopByFloyd();
         boolean flag = detectLoop(head);
         if(flag){
         	System.out.println("Loop found");
         }else{
         	System.out.println("No loop");
         }*/
		//llist.detectLoopByFloyd();
		//linklist1.printList();
	}
	}


