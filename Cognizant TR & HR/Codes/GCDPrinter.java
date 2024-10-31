import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCDPrinter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read two integers from the input
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        // Initialize min as the smaller of the two numbers
        int min = Math.min(n1, n2);

        // Time Complexity: O(min(n1, n2)) - In the worst case, the loop runs from min down to 1
        // Space Complexity: O(1) - Constant space used (only a few integer variables)
        for (int i = min; i > 0; i--) {
            // Check if i is a divisor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i); // Print the GCD
                break; // Exit the loop after finding the GCD
            }
        }
    }
}
