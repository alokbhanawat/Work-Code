package dsa;

class Node2 {

    private String data;
    private Node2 next;

    public Node2(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node2 node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public Node2 getNext() {
        return this.next;
    }
}


class LinkedList2 {

    private Node2 head;
    private Node2 tail;

    public Node2 getHead() {
        return this.head;
    }

    public Node2 getTail() {
        return this.tail;
    }

    public void addAtEnd(String data) {
        Node2 node = new Node2(data);

        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void addAtBeginning(String data) {
        Node2 node = new Node2(data);

        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            node.setNext(this.head);
            this.head = node;
        }
    }

    public void display() {
        Node2 temp = this.head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node2 find(String data) {
        Node2 temp = this.head;

        while (temp != null) {
            if (temp.getData().equals(data))
                return temp;
            temp = temp.getNext();
        }
        return null;
    }

    public void insert(String data, String dataBefore) {
        Node2 node = new Node2(data);

        if (this.head == null)
            this.head = this.tail = node;
        else {
            Node2 nodeBefore = this.find(dataBefore);
            if (nodeBefore != null) {
                node.setNext(nodeBefore.getNext());
                nodeBefore.setNext(node);
                if (nodeBefore == this.tail)
                    this.tail = node;
            } else
                System.out.println("Node not found");
        }
    }

    public void delete(String data) {

        if (this.head == null)
            System.out.println("List is empty");
        else {
            Node2 node = this.find(data);

            if (node == null)
                System.out.println("Node not found");

            if (node == this.head) {
                this.head = this.head.getNext();
                node.setNext(null);

                if (node == this.tail)
                    tail = null;
            } else {
                Node2 nodeBefore = null;
                Node2 temp = this.head;
                while (temp != null) {
                    if (temp.getNext() == node) {
                        nodeBefore = temp;
                        break;
                    }
                    temp = temp.getNext();
                }

                nodeBefore.setNext(node.getNext());

                if (node == this.tail)
                    this.tail = nodeBefore;
                node.setNext(null);
            }
        }
    }
}


class linass1 {

    public static void main(String args[]) {

        LinkedList2 linkedList = new LinkedList2();
        linkedList.addAtEnd("AB");
        linkedList.addAtEnd("BC");
        linkedList.addAtEnd("CD");
        linkedList.addAtEnd("DE");
        linkedList.addAtEnd("EF");

        String elementToBeFound = "CD";
        int position = findPosition(elementToBeFound, linkedList.getHead());
        if (position != 0)
            System.out.println("The position of the element is " + position);
        else
            System.out.println("The element is not found!");
    }

    public static int findPosition(String element, Node2 head) {
        int position = 1;
        Node2 temp = head;

        while (temp != null) {
            if (temp.getData().equals(element)) {
                return position;
            }
            temp = temp.getNext();
            position++;
        }

        return 0;
    }
}
