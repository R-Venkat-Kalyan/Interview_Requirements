// Problem Statement -
// Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
// Note: Consider the array as circular.

// Examples :

// Input: arr[] = {1,2,3,4,5}, d = 2
// Output: 3 4 5 1 2


import java.util.*;
public class RotateArrayDTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
        arr[i] = sc.nextInt();
        int d = sc.nextInt();
        rotateArray(arr,n,d);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int arr[], int n, int d) {
        // Handle cases where d > n by taking modulus (in case d > n)
        d = d % n;

        // Step 1: Reverse the first d elements (from index 0 to d-1)
        // For example, if d=2 and arr[] = {1, 2, 3, 4, 5}, after this step arr[] = {2, 1, 3, 4, 5}
        rotate(arr, 0, d - 1);

        // Step 2: Reverse the remaining elements (from index d to n-1)
        // Continuing from the previous step, if arr[] = {2, 1, 3, 4, 5}, after this step arr[] = {2, 1, 5, 4, 3}
        rotate(arr, d, n - 1);

        // Step 3: Reverse the entire array (from index 0 to n-1)
        // Finally, if arr[] = {2, 1, 5, 4, 3}, after this step arr[] = {3, 4, 5, 1, 2}, which is the rotated array
        rotate(arr, 0, n - 1);
    }

    public static void rotate(int arr[], int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
