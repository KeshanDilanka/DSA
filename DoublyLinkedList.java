package dsa;



public class DoublyLinkedList {

    class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
}
