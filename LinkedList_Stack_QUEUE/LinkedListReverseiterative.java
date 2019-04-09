package com.LinkedList_Stack_QUEUE;



public class LinkedListReverseiterative {
	
	public static class ListNode{
		public int data;
		public ListNode head;
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
	
	
	public ListNode reverseiterative(ListNode head) {
		
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null) {
		 next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			
		}
		return previous;
	}

	public static void main(String[] args) {
		
		ListNode head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		ListNode fif=new ListNode(50);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fif;
		
		LinkedListReverseiterative ob=new LinkedListReverseiterative();
		ob.dis(head);
		ListNode ob1=ob.reverseiterative(head);
		ob.dis(ob1);
		
		
	}

}
