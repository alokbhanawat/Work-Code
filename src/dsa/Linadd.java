package dsa;

class Node{
	private String data;
	private Node next;
	
	public Node (String data) {
		this.data=data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void setNext(Node node) {
		this.next = next;
	}

	public String getData() {
		return this.data;
	}

	public Node getNext() {
		return this.next;
	}
	
}
class LinkedList{
	private Node head;
	private Node tail;
	
	public Node getHead(){
		return this.head;
	}
	public Node getTail(){
		return this.tail;
	}
	public void addAtEnd(String data){
		//Create a new node
		Node node = new Node(data);
		
		//Check if the list is empty, 
		//if yes, make the node as the head and the tail
		if(this.head == null)
			this.head=this.tail=node;
		else{
    		this.tail.setNext(node);
    		this.tail=node;
		}

	}
}
public class Linadd {

	public static void main(String args[]){
		LinkedList list = new LinkedList();
		list.addAtEnd("Milan");
		list.addAtEnd("Venice");
		list.addAtEnd("Munich");
		list.addAtEnd("Vienna");
		System.out.println("Adding an element to the linked list");
	}
}