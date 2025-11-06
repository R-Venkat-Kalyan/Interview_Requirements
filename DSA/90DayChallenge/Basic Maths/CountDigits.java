import java.util.Scanner;

public class CountDigits {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        // System.out.println(countDigitsUsingString(number));
        // System.out.println(countDigitsIteratively(number));
        System.out.println(countDigitsUsingLog(number));
        input.close();
    }

    /**
     * Count digits by converting number to string.
     * TC: O(N) where N is number of digits (due to int to string conversion and length calculation)
     * O(1) because Java's String.length() directly accesses the length field stored internally in the String object and does not scan the entire string.​
     * SC: O(N) for the string representation of the number
     */
    public static int countDigitsUsingString(int number){
        String numberString = String.valueOf(number);  // O(n)
        return numberString.length();                  // O(1)
    }

    /**
     * Count digits using an iterative division approach.
     * TC: O(log₁₀(number)), as we divide by 10 each time
     * SC: O(1), uses constant extra space
     */
    public static int countDigitsIteratively(int number){
        if (number == 0) return 1;
        int digitsCount = 0;
        while(number > 0){
            digitsCount += 1;
            number /= 10;
        }
        return digitsCount;
    }

    /**
     * Count digits using logarithm (Math.log10).
     * TC: O(1), as logarithm calculation is done in constant time
     * SC: O(1), uses constant extra space
     */
    public static int countDigitsUsingLog(int number){
        if (number == 0) return 1;
        int digitsCount = (int) (Math.log10(number) + 1);
        return digitsCount;
    }


}
