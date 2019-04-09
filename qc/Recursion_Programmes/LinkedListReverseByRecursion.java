package com.qc.Recursion_Programmes;


public class LinkedListReverseByRecursion {

	public class ListNode {
		public int data;
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
			// this.next = next;

		}
	}

	/*
	 * public ListNode Reverse(ListNode head) { ListNode current = head; ListNode rt
	 * = null; if (current.next != null) { current = current.next; rt =
	 * Reverse(current);
	 * 
	 * current.next.next = current; current.next = null;
	 * 
	 * } return rt; }
	 */

	public ListNode Reverse(ListNode head) {
          ListNode current=head;
          
		if(current.next==null) {
			return current;
			
		}
		
		ListNode rt=Reverse(current.next);
           
		current.next.next=current;
		current.next=null;
		System.out.println(" " + current.data);
		
		
		return rt;
	}

	/*
	 * // for starting order public void Reverse(ListNode head) { ListNode current =
	 * head; if (current != null) { display(current); Reverse(current.next);
	 * 
	 * 
	 * 
	 * } }
	 */

	public void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
	}

	public static void main(String[] args) {

		LinkedListReverseByRecursion ob = new LinkedListReverseByRecursion();

		LinkedListReverseByRecursion.ListNode head = ob.new ListNode(10);
		LinkedListReverseByRecursion.ListNode second = ob.new ListNode(20);
		LinkedListReverseByRecursion.ListNode third = ob.new ListNode(30);
		LinkedListReverseByRecursion.ListNode fourth = ob.new ListNode(40);
		LinkedListReverseByRecursion.ListNode fifth = ob.new ListNode(50);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		ob.display(head);
		ob.Reverse(head);

	}

}
