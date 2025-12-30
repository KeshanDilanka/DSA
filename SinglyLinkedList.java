package dsa;



public class SinglyLinkedList {

    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
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
