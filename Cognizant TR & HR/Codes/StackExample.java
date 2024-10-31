import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Initialize an empty stack of Integers
        Stack<Integer> stk = new Stack<>();
        
        // Pushes the element 30959 onto the top of the stack
        stk.push(30959);
        
        // Adds the element 30976 to the stack; for a Stack, this is equivalent to push
        stk.add(30976);
        
        // Checks if the stack is empty and prints the result (false since elements are present)
        System.out.println(stk.isEmpty());
        
        // Retrieves the element at the top of the stack without removing it (peek operation)
        System.out.println(stk.peek());
        
        // Searches for 30976 in the stack; returns position from the top (1-based index)
        System.out.println(stk.search(30976));
        
        // Prints the contents of the stack
        System.out.println(stk);
        
        // Prints the number of elements currently in the stack
        System.out.println(stk.size());
        
        // Removes and returns the element at the top of the stack (pop operation)
        stk.pop();
        
        // Prints the contents of the stack after the pop operation
        System.out.println(stk);
    }
}
// Add VS Push in Stack:
// Although add works similarly to push in a Stack, it is a method from the Vector class 
// (which Stack extends), so it is not specific to stacks.