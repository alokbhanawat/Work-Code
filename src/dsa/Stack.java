package dsa;

class Stack1 {
	private int top;
	private int maxSize; 
	private int[] arr;

	Stack1(int maxSize) {
		this.top = -1;
		this.maxSize = maxSize;
		arr = new int[maxSize];
	}

	public boolean isFull() {
		if (top >= (maxSize - 1)) {
			return true;
		}
		return false;
	}

	public boolean push(int data) {
		if (isFull()) {
			return false;
		} else {
			arr[++top] = data;
			return true;
		}
	}

	public int peek() {
		if (top < 0) 
			return Integer.MIN_VALUE;
		else 
			return arr[top];
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack is empty!");
			return Integer.MIN_VALUE;
		} else {
			int poppedElement = arr[top];
			top--;
			return poppedElement;
		}
	}

	public void display() {
		System.out.println("Displaying Stack Elements");
		for (int index = top; index >= 0; index--) {
			System.out.println(arr[index]);
		}
	}
}

class Stack {
	public static void main(String args[]) {
		Stack1 stack = new Stack1(5);
        System.out.println("Stack created.\n");

		if (stack.push(1))
			System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");

		if (stack.push(2))
			System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");

		if (stack.push(3))
			System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");

		if (stack.push(4))
			System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");

		if (stack.push(5))
			System.out.println("The element is pushed to the stack!\n");
        else
            System.out.println("Stack is full!\n");

		stack.display();

		if (stack.push(6))
			System.out.println("The element is pushed to the stack!\n");
		else
			System.out.println("Stack is full!\n");

		System.out.println("The top element is : " + stack.peek());

        // Testing pop
        System.out.println("\nPopping elements:");
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        stack.display(); // Display stack after poppin
	}
}
