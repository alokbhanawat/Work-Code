package dsa;

class Queue {
	
	private int front; 
	private int rear; 
	private int maxSize; 
	private String arr[];
	
	Queue(int maxSize) {
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
	
	
	public boolean enqueue(String data) {
		if (isFull()) {
			return false;
		} else {
			arr[++rear] = data;
			return true;
		}
	}

	
	public void display() {
		System.out.println("Displaying queue elements");
		for (int index = front; index <= rear; index++) {
			System.out.println(arr[index]);
		}
	}

}

class Enqueue {

	public static void main(String[] args) {

	    Queue queue = new Queue(5);
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

	}
}