import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the input number as a string
        String n = br.readLine();

        // Approach 1: Reverse using character swapping
        System.out.println(reverseUsingStringSwap(n));

        // Approach 2: Reverse using arithmetic operations
        int number = Integer.parseInt(n);
        System.out.println(reverseUsingArithmetic(number));
    }

    /**
     * Approach 1: Reverse the number using character swapping.
     *
     * @param n The number as a string
     * @return The reversed number as an integer
     *
     * Time Complexity: O(d) - Where d is the number of digits in n
     *   - We loop over half the string to swap characters.
     *
     * Space Complexity: O(d) - The additional space is used for the character array.
     */
    public static int reverseUsingStringSwap(String n) {
        int i = 0, j = n.length() - 1;
        char[] ch = n.toCharArray(); // Convert string to character array

        // Swap characters from both ends towards the middle
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        // Convert the character array back to a string and parse it as an integer
        return Integer.parseInt(new String(ch));
    }

    /**
     * Approach 2: Reverse the number using arithmetic operations.
     *
     * @param n The number as an integer
     * @return The reversed number as an integer
     *
     * Time Complexity: O(d) - Where d is the number of digits in n
     *   - Each iteration extracts and processes a single digit.
     *
     * Space Complexity: O(1) - Uses constant space.
     */
    public static int reverseUsingArithmetic(int n) {
        int reversed = 0;
        
        // Loop until all digits are processed
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Add the digit to the reversed number
            n /= 10; // Remove the last digit from n
        }
        
        return reversed;
    }
}
