import java.io.*;
public class Armstrong {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        String input = br.readLine();
        int number = Integer.parseInt(input);

        // Checking Armstrong using String-based approach
        System.out.println("Using String-Based Approach:");
        if (isArmstrongStringBased(input)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("NOT");
        }

        // Checking Armstrong using Modulo-based approach
        System.out.println("Using Modulo-Based Approach:");
        if (isArmstrongModuloBased(number)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("NOT");
        }
    }

    /**
     * String-based approach to check if a number is an Armstrong number.
     * 
     * @param n String representation of the number
     * @return true if the number is an Armstrong number, false otherwise
     *
     * Time Complexity: O(d) - Where d is the number of digits in the number
     *  - String conversion and character extraction takes O(d)
     *  - Power calculation and summation for each digit also takes O(d)
     *
     * Space Complexity: O(d) - Uses extra space for string and character array representation of the number
     */
    public static boolean isArmstrongStringBased(String n) {
        int ans = 0;
        int length = n.length(); // Get the length of the number (number of digits)
        
        // Iterate through each character in the string
        for (char c : n.toCharArray()) {
            int val = c - '0'; // Convert character to integer
            ans += Math.pow(val, length); // Raise to the power of the number of digits
        }

        // Compare calculated result with the original number
        return ans == Integer.parseInt(n);
    }

    /**
     * Modulo-based approach to check if a number is an Armstrong number.
     * 
     * @param n Integer representation of the number
     * @return true if the number is an Armstrong number, false otherwise
     *
     * Time Complexity: O(d) - Where d is the number of digits in the number
     *  - Digit extraction and power calculation for each digit take O(d)
     *
     * Space Complexity: O(1) - Uses constant space as it operates directly on integer digits
     */
    public static boolean isArmstrongModuloBased(int n) {
        int original = n; // Store original number for final comparison
        int ans = 0;
        int length = String.valueOf(n).length(); // Get the number of digits

        // Process each digit from right to left
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            ans += Math.pow(digit, length); // Raise to the power of the number of digits
            n /= 10; // Remove the last digit
        }

        // Compare calculated result with the original number
        return ans == original;
    }
}
