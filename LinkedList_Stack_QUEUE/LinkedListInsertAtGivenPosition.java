package com.LinkedList_Stack_QUEUE;

public class LinkedListInsertAtGivenPosition {
	
	public static class ListNode{
		
		public int data;
		public ListNode head;
		public ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			
		}
	}
	
	public void display(ListNode head) {
		ListNode current=head;
		while(current!=null){
			System.out.print(current.data + " -->");
	
		current=current.next;
		}
		
	}
	public ListNode insertatposition(ListNode head,int position,int data) {
    ListNode current=head;
    ListNode previous =current.next;
    ListNode newnode=new ListNode(data);
    int count=1;
    while(count<position-1) {
    	current=current.next;
    	previous=current.next;
    	count++;
    }
    current.next=newnode;
    newnode.next=previous;  
    
    
    
	return head;
		
	}
	
	
	public static void main(String[] args) {
		ListNode head =new ListNode(10);
		ListNode second =new ListNode(20);
		ListNode third =new ListNode(30);
		ListNode fourth =new ListNode(40);
		

		head.next=second;
		second.next=third;
		third.next=fourth;
		
		LinkedListInsertAtGivenPosition object=new LinkedListInsertAtGivenPosition();
		object.display(head);
		System.out.println();
		ListNode newnode=object.insertatposition(head, 3, 50);
		object.display(newnode);
		
	}

}
