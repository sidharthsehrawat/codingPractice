package com.LinkedList_Stack_QUEUE;

public class QueueImplementation {
	public Queue head;
	public Queue tail;

	public class Queue {

		public int data;
		public Queue next;

		public Queue(int data) {
			this.data = data;

		}

		public Queue() {

		}

		public int enqueue(int data) {
			Queue node = new Queue(data);

			if (head == null) {
				head = node;
				tail=node;
			} else {
				tail.next = node;
				tail = tail.next;
			}

			return node.data;
		}

		public int dequeue() {

			if (head == null) {
				System.out.println("Queue is Empty");
				return -1;
			} else {
				int temp = head.data;
				head = head.next;
				return temp;
			}

		}

		public void display() {
			Queue current = head;
			while (current != null) {
				System.out.println(current.data);
				current = current.next;

			}

		}

	}

	public static void main(String[] args) {
		QueueImplementation ob = new QueueImplementation();

		QueueImplementation.Queue queue = ob.new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.display();
		queue.dequeue();
		queue.display();
	}

}
