package arunesh;

import java.util.LinkedList;
import java.util.Queue;

 class Main {
    public static void main(String[] args) {
        // Create a queue
        Queue<Integer> myQueue = new LinkedList<>();

        // Adding elements to the queue
        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);

        // Displaying the queue
        System.out.println("Queue elements: " + myQueue);

        // Removing elements from the queue
        int removedElement = myQueue.poll();
        System.out.println("Removed element: " + removedElement);

        // Displaying the updated queue
        System.out.println("Updated queue elements: " + myQueue);
    }
}
