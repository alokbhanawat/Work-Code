package dsa;
class Queue1 {

	private int front; 
	private int rear; 
	private int maxSize; 
	private String arr[];

	Queue1(int maxSize) {
		this.front = 0;
		this.rear = -1; 
		this.maxSize = maxSize;
		this.arr = new String[maxSize];
	}

	
	public boolean isFull() {
		if (rear == maxSize - 1) {
			return true;
		}
		return false;
	}

	// Adding a new element to the rear of queue
	public boolean enqueue(String data) {
		if (isFull()) {
			return false;
		} else {
			arr[++rear] = data;
			return true;
		}
	}

	public void display() {
		if (isEmpty())
			System.out.println("Queue is empty!");
		else {
			System.out.println("Displaying queue elements");
			for (int index = front; index <= rear; index++) {
				System.out.println(arr[index]);
			}
		}
	}

	public boolean isEmpty() {
		if (front > rear)
			return true;
		return false;
	}

	// Removing an element from the front of queue
	public String dequeue() {
		if (isEmpty()) {
			return "empty";
		} else {
			String data = arr[this.front];
			arr[front++] = null;
			return data;
		}
	}
}


public class Dequeue {

	public static void main(String[] args) {

		Queue1 queue = new Queue1(5);
		System.out.println("Queue created.\n");

		if (queue.enqueue("Joe"))
			System.out.println("The element is enqueued to the queue!\n");
		else
			System.out.println("Queue is full!\n");

		if (queue.enqueue("Jack"))
			System.out.println("The element is enqueued to the queue!\n");
		else
			System.out.println("Queue is full!\n");

		if (queue.enqueue("Eva"))
			System.out.println("The element is enqueued to the queue!\n");
		else
			System.out.println("Queue is full!\n");

		if (queue.enqueue("Mia"))
			System.out.println("The element is enqueued to the queue!\n");
		else
			System.out.println("Queue is full!\n");

		if (queue.enqueue("Luke"))
			System.out.println("The element is enqueued to the queue!\n");
		else
			System.out.println("Queue is full!\n");

		queue.display();

		if (queue.enqueue("Emma"))
			System.out.println("The element is enqueued to the queue!\n");
		else
			System.out.println("Queue is full!\n");

		String dequeuedElement = queue.dequeue();
		if (dequeuedElement == "empty")
			System.out.println("Queue is empty\n");
		else
			System.out.println("The element dequeued is : " + dequeuedElement + "\n");

		dequeuedElement = queue.dequeue();
		if (dequeuedElement == "empty")
			System.out.println("Queue is empty\n");
		else
			System.out.println("The element dequeued is : " + dequeuedElement + "\n");

		dequeuedElement = queue.dequeue();
		if (dequeuedElement == "empty")
			System.out.println("Queue is empty\n");
		else
			System.out.println("The element dequeued is : " + dequeuedElement + "\n");

		dequeuedElement = queue.dequeue();
		if (dequeuedElement == "empty")
			System.out.println("Queue is empty\n");
		else
			System.out.println("The element dequeued is : " + dequeuedElement + "\n");

		dequeuedElement = queue.dequeue();
		if (dequeuedElement == "empty")
			System.out.println("Queue is empty\n");
		else
			System.out.println("The element dequeued is : " + dequeuedElement + "\n");

		dequeuedElement = queue.dequeue();
		if (dequeuedElement == "empty")
			System.out.println("Queue is empty\n");
		else
			System.out.println("The element dequeued is : " + dequeuedElement + "\n");
		

	}
}