package com.LinkedList_Stack_QUEUE;

public class LinkedListInsertAtLast {
	
	public static class ListNode{
		
		public int data;
		public ListNode next;
		public  ListNode head;
		
		public ListNode (int data) {
			this.data=data;
			
		}
		
		
		
	}
	
	public void display(ListNode head) {
		if(head==null) {
			return;
		}
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data + "-->");
			current=current.next;
		}
		
	}
	
	public ListNode insertAtLast(int data ,ListNode head) {
		
	ListNode current=head;
	ListNode newnode=new ListNode(data);
	
	while(current.next!=null) {
		
		current=current.next;
	}
	
	current.next=newnode;
	newnode.next=null;
	
	return head;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ListNode head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		
		LinkedListInsertAtLast obj=new LinkedListInsertAtLast();
		obj.display(head);
		System.out.println();
		
		ListNode newnode=obj.insertAtLast(50, head);
		obj.display(newnode);
		
		
		
	}

}
