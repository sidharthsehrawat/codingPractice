package com.LinkedList_Stack_QUEUE;

public class LInkedListDeleteFromLast {

	public static class ListNode {

		public int data;
		public ListNode head;
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}

	}
	
	public ListNode deletefromlast(ListNode head) {
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=null;
		
		return current;
		
		
		
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		

		head.next = second;
		second.next = third;
		third.next = fourth;
				
		LInkedListDeleteFromLast ob=new LInkedListDeleteFromLast();
		ob.display(head);
		System.out.println();
		ListNode del=ob.deletefromlast(head);
		
		ob.display(del);
		System.out.println();
		System.out.println("last deleted node = " +  del.data);

	}

	
}
