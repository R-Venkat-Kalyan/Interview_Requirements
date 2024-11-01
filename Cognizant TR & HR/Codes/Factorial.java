import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Calling different factorial methods and displaying their results
        System.out.println("Iterative Approach: " + factorialIterative(n)); // O(n) time, O(1) space
        System.out.println("Recursive Approach: " + factorialRecursive(n)); // O(n) time, O(n) space
        System.out.println("Optimized Approach: " + factorialOptimized(n)); // O(n) time, O(n) space

        sc.close();
    }

    // 1. Iterative Approach
    // This approach uses a loop to calculate the factorial.
    // Time Complexity: O(n) - loop runs 'n' times.
    // Space Complexity: O(1) - no extra space used except for 'fact'.
    public static int factorialIterative(int n) {
        int fact = 1; // Initialize factorial result as 1
        for (int i = 1; i <= n; i++) { // Loop from 1 to 'n'
            fact *= i; // Multiply fact by the current number
        }
        return fact; // Return the factorial result
    }

    // 2. Recursive Approach
    // This approach uses recursion to calculate the factorial.
    // Time Complexity: O(n) - each call decreases 'n' by 1.
    // Space Complexity: O(n) - uses recursive stack space proportional to 'n'.
    public static int factorialRecursive(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) return 1;
        // Recursive call: n * factorial of (n-1)
        return n * factorialRecursive(n - 1);
    }

    // 3. Optimized Approach (Memoization)
    // This approach uses memoization to store already calculated values.
    // Time Complexity: O(n) - each factorial from 1 to 'n' is calculated only once.
    // Space Complexity: O(n) - array 'memo' is used to store results.
    public static int factorialOptimized(int n) {
        int[] memo = new int[n + 1]; // Array to store computed factorials
        memo[0] = 1; // factorial of 0 is 1

        // Compute each factorial from 1 to 'n' and store it in memo
        for (int i = 1; i <= n; i++) {
            memo[i] = i * memo[i - 1]; // Current factorial is i * (previous factorial)
        }
        
        return memo[n]; // Return the factorial of 'n'
    }
}
