package dsa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPushFriendly {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation - O(1)
    void push(int x) {
        q1.add(x);
        System.out.println(x + " pushed into stack");
    }

    // Pop operation - O(n)
    int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        // Move elements except last
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int popped = q1.remove();

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }
}