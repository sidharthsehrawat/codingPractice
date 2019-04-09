package com.LinkedList_Stack_QUEUE;



public class LinkedListDeleteAtGivenPos {
	
	public static class ListNode {
		public int data;
		public  ListNode head;
		
		public ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			
		}
	}
	
	public void dis(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}

	}
	
	
	public ListNode deleteatgivenpos(ListNode head ,int pos) {
		
		int count=1;
		
		ListNode current=head;
		ListNode previous =current.next;
		while(count<pos-1) {
			current=current.next;
			previous=current;
		}
		current=previous.next;
		
	return current;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		ListNode fif=new ListNode(50);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fif;
		
		LinkedListDeleteAtGivenPos obj=new LinkedListDeleteAtGivenPos();
		obj.dis(head);
		System.out.println();
        ListNode del=obj.deleteatgivenpos(head, 2);
        obj.dis(del);
        System.out.println();
        System.out.println( "deleted node  = " + del.data );
		
	}

}
