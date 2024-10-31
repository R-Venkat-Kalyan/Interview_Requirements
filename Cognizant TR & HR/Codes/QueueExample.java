import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Initialize an empty queue of Integers
        Queue<Integer> queue = new LinkedList<>();
        
        // Adds elements to the back of the queue (enqueue operation)
        queue.add(30959);
        queue.offer(30976);  // offer is similar to add, but doesn't throw an exception if capacity is full
        
        // Checks if the queue is empty and prints the result (false since elements are present)
        System.out.println("Is the queue empty? " + queue.isEmpty());
        
        // Retrieves the element at the front of the queue without removing it (peek operation)
        System.out.println("Peek (front element): " + queue.peek());
        
        // Retrieves and removes the front element of the queue (dequeue operation)
        System.out.println("Removed element: " + queue.poll());
        
        // Prints the contents of the queue after one removal
        System.out.println("Queue after poll: " + queue);
        
        // Prints the number of elements currently in the queue
        System.out.println("Queue size: " + queue.size());
        
        // Clears all elements from the queue
        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
}

    

