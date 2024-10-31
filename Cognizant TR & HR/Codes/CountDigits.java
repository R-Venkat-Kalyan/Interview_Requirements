import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountDigits {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read an integer from the console
        int n = Integer.parseInt(br.readLine());
        
        // Call and print the result of both approaches for counting digits
        System.out.println(countDigitsApproach1(n));
        System.out.println(countDigitsApproach2(n));
    }

    /**
     * Approach 1: Count digits using integer division.
     * 
     * @param n The integer number whose digits are to be counted
     * @return The count of digits in the number
     * 
     * Time Complexity: O(d) - Where d is the number of digits in the number
     *   - Each division by 10 reduces the number by one digit, so it loops d times.
     * 
     * Space Complexity: O(1) - Uses constant space for count variable.
     */
    public static int countDigitsApproach1(int n) {
        int count = 0; // Initialize count of digits
        
        // Loop until n becomes 0
        while (n > 0) {
            count += 1; // Increment count for each digit
            n /= 10; // Remove the last digit from n by integer division
        }
        
        // Return the total count of digits
        return count;
    }

    /**
     * Approach 2: Count digits by converting the number to a string.
     * 
     * @param n The integer number whose digits are to be counted
     * @return The count of digits in the number
     * 
     * Time Complexity: O(d) - Where d is the number of digits
     *   - Converting an integer to a string takes O(d) time.
     * 
     * Space Complexity: O(d) - Uses additional space for the string representation of the number.
     */
    public static int countDigitsApproach2(int n) {
        // Convert the integer to a string
        String n1 = String.valueOf(n);
        
        // Return the length of the string (number of digits in the original integer)
        return n1.length();
    }
}
