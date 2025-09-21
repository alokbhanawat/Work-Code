package dsa;

import java.util.Scanner;

public class prll2 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void create() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Data:");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node; // first node
            } else {
                System.out.println("Enter 1 To insert at Beginning, 2 To Add at End, 3 For Specific Position");
                m = sc.nextInt();
                switch (m) {
                    case 1: // insert at beginning
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2: // insert at end
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;

                    case 3: // insert at specific position
                        System.out.println("Enter Position To be Inserted:");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1) && temp1 != null; i++) {
                            temp1 = temp1.next;
                        }
                        if (temp1 != null) {
                            new_node.next = temp1.next;
                            temp1.next = new_node;
                        } else {
                            System.out.println("Invalid position! Node inserted at end.");
                            Node t = head;
                            while (t.next != null) {
                                t = t.next;
                            }
                            t.next = new_node;
                        }
                        break;

                    default:
                        System.out.println("Invalid choice! Adding at end by default.");
                        Node t2 = head;
                        while (t2.next != null) {
                            t2 = t2.next;
                        }
                        t2.next = new_node;
                        break;
                }
            }

            System.out.println("Do You want To Add More Data? If Yes press 1");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverser1() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List does not exist!");
        } else {
            System.out.println("Linked List Elements:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        prll2 ll = new prll2();
        ll.create();
        ll.traverser1();
    }
}
