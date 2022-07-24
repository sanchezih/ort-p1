package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.cola.impl_array.src;

/**
 * Java program to implement a queue using an array
 * 
 * @author ihsanch
 *
 */
public class Queue {

	private int front;
	private int rear;
	private int capacity;
	private int queue[];

	// Constructor
	public Queue(int c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}

	/**
	 * Function to insert an element at the rear of the queue
	 * 
	 * @param data
	 */
	void queueEnqueue(int data) {
		// check queue is full or not
		if (capacity == rear) {
			System.out.printf("\nQueue is full\n");
			return;
		}

		// insert element at the rear
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}

	/**
	 * Function to delete an element from the front of the queue
	 */
	void queueDequeue() {
		// if queue is empty
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}

		// shift all the elements from index 2 till rear
		// to the right by one
		else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}

			// store 0 at rear indicating there's no element
			if (rear < capacity)
				queue[rear] = 0;

			// decrement rear
			rear--;
		}
		return;
	}

	// print queue elements
	void queueDisplay() {
		int i;
		if (front == rear) {
			System.out.printf("Queue is Empty\n");
			return;
		}

		// traverse front to rear and print elements
		for (i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", queue[i]);
		}
		return;
	}

	// print front of queue
	void queueFront() {
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}
		System.out.printf("\nFront Element is: %d", queue[front]);
		return;
	}
}
