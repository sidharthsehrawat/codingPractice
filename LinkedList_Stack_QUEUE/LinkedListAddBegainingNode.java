package com.LinkedList_Stack_QUEUE;

public class LinkedListAddBegainingNode{

public static class ListNode {
	
	public static ListNode head;
	public int data;
	public  ListNode next;
	
	public ListNode(int data) {
		this.data=data;
		this.next=next;
	}
		
}


private void display(ListNode head) {
	if(head==null) {
		return;
	}
	ListNode current=head;
	while(current!=null) {
		System.out.print(current.data + " -->");
		current=current.next;
	}
	
}


public ListNode insertbegainingmethod(ListNode head ,int data ) {
	ListNode current=head;

	ListNode newnode=new ListNode(data);
	
	if(head==null) {
		newnode=head;
	}
	
	
	newnode.next=current;
	current=newnode;
	
	return current;
	
}

	

	public static void main(String[] args) {
		
		ListNode head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		
		
		/*
		 * second= head.next; third=second.next; fourth=third.next;
		 */
		
		head.next=second;
		second.next=third;
		third.next=fourth;
				
		
		LinkedListAddBegainingNode obj=new LinkedListAddBegainingNode();
		
		obj.display(head);
		System.out.println();
		
		ListNode newnode= obj.insertbegainingmethod(head,90);
		obj.display(newnode);
		
	}




}
