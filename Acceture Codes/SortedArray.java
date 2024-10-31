
/*Problem Statement:
You are given an array A consisting of N positive numbers. In one operation, you can take any subarray of the array and replace it with its sum. You can perform this operation any number of times. Your task is to print a number that denotes the maximum length of the non-decreasing array after performing the above operations. For example: If A : [1, 4, 2, 6, 9], you can choose the subarray [2,6] and replace it with its sum. We get A : [1, 4, 8, 9]. Therefore in 1 operation, the array can be made non-decreasing.



Input format:

The input consists of two lines:

The first line contains an integer N.

The second line contains N space-separated integers denoting the array elements.

The input will be read from the STDIN by the candidate.

Output Format:

Output a single integer denoting the maximum length of the non-decreasing array after performing the operations.



Sample Input:

5

1 4 2 6 9
Sample Output:

4
*/
import java.util.Scanner;
public class SortedArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        
        // Read the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Initialize variables
        int cur_len = 1;
        int cur_ele = arr[0];
        
        // Loop through the array from the second element
        for (int i = 1; i < n; i++) {
            if (arr[i] != cur_ele) {
                cur_len++;
                cur_ele = arr[i];
            } else {
                cur_ele += arr[i];
            }
        }
        
        // Output the result
        System.out.println(cur_len);
        
        sc.close();
    }
}

