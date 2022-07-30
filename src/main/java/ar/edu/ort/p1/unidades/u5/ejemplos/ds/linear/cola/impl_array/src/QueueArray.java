package ar.edu.ort.p1.unidades.u5.ejemplos.ds.linear.cola.impl_array.src;

import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

/**
 * Java program to implement a queue using an array
 * 
 * @author ihsanch
 *
 */
public class QueueArray<T> implements Cola<T> {

	private int front;
	private int rear;
	private int capacity;
	private int queue[];

	// Constructores
	public QueueArray(int c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void checkEmptiness() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void checkFullness() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(T element) {
		// check queue is full or not
		if (capacity == rear) {
			System.out.printf("\nQueue is full\n");
			return;
		}

		// insert element at the rear
		else {
			queue[rear] = (int) element;
			rear++;
		}
		return;

	}

	@Override
	public T remove() {
		// if queue is empty
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return null;
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
		return null;
	}

	@Override
	public T get() {
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return null;
		}
		System.out.printf("\nFront Element is: %d", queue[front]);
		return null;
	}

	/**
	 * Print queue elements
	 */
	public void queueDisplay() {
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
}
