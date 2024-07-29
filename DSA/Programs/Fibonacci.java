import java.util.Scanner;

public class Fibonacci {
  public static void main(String args[]) {
    // Create a Scanner object to read input from the console
    Scanner sc = new Scanner(System.in);

    // Prompt the user to enter the value of 'n'
    System.out.print("Enter the value of n: ");
    int n = sc.nextInt(); // Read the input value for 'n'

    // Calculate and print the nth Fibonacci term using the recursive approach
    System.out.println("Nth fibonacci term (recursive) is: " + fibonacciRecursive(n));
    
    // Calculate and print the nth Fibonacci term using the iterative approach
    System.out.println("Nth fibonacci term (iterative) is: " + fibonacciIterative(n));
  }

  // Recursive method to calculate the nth Fibonacci term
  public static int fibonacciRecursive(int n) {
    // Base case: if n is 0, the Fibonacci term is 0
    if (n == 0) {
      return 0;
    } 
    // Base case: if n is 1, the Fibonacci term is 1
    else if (n == 1) {
      return 1;
    } 
    // Recursive case: calculate the term by summing the previous two terms
    else {
      return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
  }

  // Iterative method to calculate the nth Fibonacci term
  public static int fibonacciIterative(int n) {
    if (n <= 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    }

    int a = 1, b = 1, c;
    for (int i = 3; i <= n; i++) {
      c = a + b;
      a = b;
      b = c;
    }
    return b;
  }
}

/*
 * Time Complexity (Recursive):
 * The time complexity of the recursive Fibonacci function is O(2^n).
 * This is because each call to fibonacciRecursive(n) makes two recursive calls to fibonacciRecursive(n-1) and fibonacciRecursive(n-2),
 * leading to an exponential number of calls as n increases.
 *
 * Space Complexity (Recursive):
 * The space complexity of the recursive Fibonacci function is O(n).
 * This is because the maximum depth of the recursion tree is 'n', 
 * which means at most 'n' function calls will be on the call stack at any point in time.
 */

/*
 * Time Complexity (Iterative):
 * The time complexity of the iterative Fibonacci function is O(n).
 * This is because we have a single loop that iterates from 3 to 'n',
 * performing a constant amount of work in each iteration.
 *
 * Space Complexity (Iterative):
 * The space complexity of the iterative Fibonacci function is O(1).
 * This is because we are using a constant amount of space to store variables 'a', 'b', and 'c',
 * regardless of the input size 'n'.
 */
