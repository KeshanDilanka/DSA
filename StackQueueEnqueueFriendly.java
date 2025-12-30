package dsa;

import java.util.Stack;

public class StackQueueEnqueueFriendly {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue (O(1))
    void enqueue(int x) {
        s1.push(x);
    }

    // Dequeue (O(n))
    int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        while (s1.size() > 1) {
            s2.push(s1.pop());
        }

        int dequeued = s1.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return dequeued;
    }
    
}
