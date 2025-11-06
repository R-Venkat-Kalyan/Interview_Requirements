import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        // System.out.println(reverseDigitsUsingString(number));
        System.out.println(reverseDigitsIteratively(number));
        input.close();
    }

    /**
     * Reverse digits by converting to string and using StringBuffer.reverse().
     * TC: O(N) for String.valueOf(number) and StringBuffer.reverse()
     * SC: O(N) for storing the string and StringBuffer
     * Note: String.valueOf(int) is O(N), StringBuffer constructor is O(N), reverse() is O(N)
     */
    public static String reverseDigitsUsingString(int number){
        String numberString = String.valueOf(number); // TC: O(N), SC: O(N)
        StringBuffer sb = new StringBuffer(numberString); // TC: O(N), SC: O(N)
        sb.reverse(); // TC: O(N), SC: O(1) (in-place)
        return sb.toString(); // TC: O(N), SC: O(N)
    }

    /**
     * Reverse digits using iterative division and multiplication.
     * TC: O(log₁₀(number)), as we process each digit once
     * SC: O(1), uses constant extra space
     */
    public static int reverseDigitsIteratively(int number){
        if (number == 0) return 0;
        int revNum = 0;
        while(number > 0){
            int ld = number % 10;
            revNum = (revNum * 10) + ld;
            number = number / 10;
        }
        return revNum;
    }
}
