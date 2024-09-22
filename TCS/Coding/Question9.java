// Problem Statement -
// An intelligence agency has received reports about some threats. The reports consist of numbers in a mysterious method. There is a number “N” and another number “R”. Those numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are summed up and this action is performed ‘R’ number of times. The resultant is also a single digit that is yet to be deciphered. The task here is to find the single-digit sum of the given number ‘N’ by repeating the action ‘R’ number of times.
// If the value of ‘R’ is 0, print the output as ‘0’.

// Example 1:

// Input : 99 -> Value of N
// 3  -> Value of R

// Output : 9  -> Possible ways to fill the cistern.

// Explanation:
// Here, the number N=99
// Sum of the digits N: 9+9 = 18
// Repeat step 2 ‘R’ times i.e. 3 tims  (9+9)+(9+9)+(9+9) = 18+18+18 =54
// Add digits of 54 as we need a single digit 5+4
// Hence , the output is 9.

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int r = sc.nextInt();

        if (r == 0) {
            System.out.println(0);
            return;
        }

        int sum = 0;
        for (char c : n.toCharArray()) {
            int val = c - '0';
            sum += val;
        }

        int rep = sum * r;

        int ans = getSingleDigitSum(rep);

        System.out.println(ans);
    }

    public static int getSingleDigitSum(int num) {
        while (num >= 10) {
            int tempSum = 0;
            while (num > 0) {
                tempSum += num % 10;
                num /= 10;
            }
            num = tempSum;
        }
        return num;
    }
}

