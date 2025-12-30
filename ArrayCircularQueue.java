package dsa;



public class ArrayCircularQueue {

    int[] queue;
    int front = -1, rear = -1, size;

    ArrayCircularQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        queue[rear] = value;
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return value;
    }
    
}
