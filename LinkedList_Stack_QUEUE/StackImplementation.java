package com.LinkedList_Stack_QUEUE;

public class StackImplementation {
	public StackNode top;

	public class StackNode {

		public int data;
		public StackNode next;

		public StackNode() {
		}

		public StackNode(int data) {
			this.data = data;
		}

		public int peeK() {
			if (isempty() == true) {
				return -1;
			} else {
				return top.data;
			}

		}

		public void push(int data) {

			StackNode node = new StackNode(data);
			if (isempty() == true) {
				top = node;
			} else {
				  node.next = top; 
				  top = node;
			}

		}

		public int pop() {
			int data1 = 0;
			if (isempty() == true) {

				System.out.println("Stack is empty");
				return -1;

			} else {
				data1 = top.data;
				top = top.next;
			}

			return data1;

		}

		public boolean isempty() {

			if (top == null) {
				return true;

			} else {
				return false;
			}

		}

		public void display() {
			StackNode current = top;
			if (isempty() == false) {

				while (current != null) {
					System.out.println(current.data);
					current = current.next;

				}
			}

			else

			{
				System.out.println("Stack is Empty");

			}
		}
	}

	public static void main(String[] args) {

		StackImplementation ob = new StackImplementation();

		StackImplementation.StackNode stack = ob.new StackNode();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		stack.pop();
		stack.push(40);
		stack.peeK();
		stack.pop();
		stack.display();

		stack.push(10);
		stack.peeK();

		stack.display();

	}

}
