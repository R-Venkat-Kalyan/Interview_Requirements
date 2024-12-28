// The Fibonacci Series is a series where the next term is the sum of the previous two terms.
// 0 1 1 2 3 5 8 13 21 34
public class Fibonacci {
   
    public static void main(String args[]){
        int a = 0, b = 1;  // Initialize first two numbers of Fibonacci series
        int n = 10;  // Number of terms to display

        System.out.print(a + " " + b + " ");  // Print first two numbers

        // Start the loop from the third term, since first two terms are already printed
        for (int i = 2; i < n; i++) {
            int next = a + b;  // Calculate the next term
            System.out.print(next + " ");  // Print the next term

            // Update the values of a and b for the next iteration
            a = b;  // Move b to a's place
            b = next;  // Move next to b's place
        }
    }
}
