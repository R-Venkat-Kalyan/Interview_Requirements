import java.util.*;

public class BuiltInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // Adding elements to the list:
        list.addFirst("rvk"); // Adds "rvk" to the start of the list
        list.add("reddy");    // Adds "reddy" at the end of the list
        list.addLast("kalyan"); // Adds "kalyan" to the end of the list
        list.add(1, "R");      // Inserts "R" at index 1, shifting elements to the right

        // Reversing the list using Collections.reverse
        Collections.reverse(list); // Reverses the order of elements in the list
        System.out.println("Reversed List: " + list);
        
        // Checking if list contains a specific element:
        System.out.println("List contains 'R': " + list.contains("R")); // Returns true if "R" is in the list

        // Accessing elements by index or position:
        System.out.println("Element at index 1: " + list.get(1));       // Gets the element at index 1
        System.out.println("First element: " + list.getFirst());        // Gets the first element of the list
        System.out.println("Last element: " + list.getLast());          // Gets the last element of the list

        // Finding index of specific elements:
        System.out.println("Index of 'reddy': " + list.indexOf("reddy")); // Returns the first occurrence of "reddy"
        System.out.println("Last index of 'reddy': " + list.lastIndexOf("reddy")); // Returns the last occurrence of "reddy"

        // Removing elements with handling for potential errors:
        if (!list.isEmpty()) {
            System.out.println("Removed first element: " + list.remove()); // Removes and returns the first element
        } else {
            System.out.println("List is empty; cannot remove first element.");
        }

        if (list.size() > 1) { // Ensures index 1 exists before attempting removal
            System.out.println("Removed element at index 1: " + list.remove(1)); // Removes element at index 1
        } else {
            System.out.println("Cannot remove element at index 1; list size is too small.");
        }

        if (!list.isEmpty()) {
            System.out.println("Removed first element using removeFirst(): " + list.removeFirst()); // Removes first element
        } else {
            System.out.println("List is empty; cannot use removeFirst().");
        }

        if (!list.isEmpty()) {
            System.out.println("Removed last element using removeLast(): " + list.removeLast()); // Removes last element
        } else {
            System.out.println("List is empty; cannot use removeLast().");
        }

        // Setting a value at a specific index:
        if (list.size() > 1) { // Checks if there are at least two elements to avoid an out-of-bounds error
            list.set(1, "REDDY"); // Replaces element at index 1 with "REDDY"
            System.out.println("Updated element at index 1 to 'REDDY'");
        } else {
            System.out.println("Cannot set element at index 1; list size is too small.");
        }

        // Checking the size of the list:
        System.out.println("Size of the list: " + list.size()); // Outputs the number of elements in the list

        // Clearing all elements from the list:
        list.clear(); // Removes all elements from the list
        System.out.println("List after clearing all elements: " + list); // Displays the now empty list
    }
}
