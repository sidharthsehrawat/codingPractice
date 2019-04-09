package com.LinkedList_Stack_QUEUE;

import com.LinkedList_Stack_QUEUE.LinkedListInsertAtGivenPosition.ListNode;

public class LinkedListDeletefromfront {
	
	public static class Listnode{
		
		public int data;
		public Listnode head;
		public Listnode next;
	
	
		public Listnode(int data) {
			this.data=data;
		}
	}
	public void display(Listnode head) {
		Listnode current=head;
		while(current!=null){
			System.out.print(current.data + " -->");
	
		current=current.next;
		}
		
	}
	
	public Listnode deletefromfront(Listnode head) {
		
		
		Listnode current=head;
		Listnode temp=current;
		
		temp.next=null;
		current=current.next;
	
		
		return temp;
		
		
	}
	
	public static void main(String[] args) {
		Listnode head =new Listnode(10);
		Listnode second =new Listnode(20);
		Listnode third =new Listnode(30);
		Listnode fourth =new Listnode(40);
		

		head.next=second;
		second.next=third;
		third.next=fourth;
		
		LinkedListDeletefromfront object1=new LinkedListDeletefromfront();
		object1.display(head);
		System.out.println();
		Listnode newnode=object1.deletefromfront(head);
		object1.display(newnode);
		
		

	}

}
