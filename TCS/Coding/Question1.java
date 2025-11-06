//   Problem Statement :
//   A chocolate factory is packing chocolates into the packets. The chocolate
//   packets here represent an array of N number of integer values. The task is to
//   find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

//   Example 1 :
//   N=8 and arr = [4,5,0,1,9,0,5,0].
//   There are 3 empty packets in the given set. These 3 empty packets representedas O should be pushed towards the end of the array

//   Input :

//   8 – Value of N
//   [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline
//   Output: 4 5 1 9 5 0 0 0

// push zeros to end of array
import java.util.Scanner;
import java.util.Arrays;

public class Question1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		// pushZerosToEnd(arr,n);
		pushZerosToStart(arr,n);
	}

	static void pushZerosToEnd(int arr[], int n) {
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0)
				arr[count++] = arr[i];
		}
		for (int i = count; i < n; i++)
			arr[i] = 0;
		System.out.println(Arrays.toString(arr));
	}

	static void pushZerosToStart(int arr[], int n) {
	int count = n - 1;

	// Traverse array from end and move non-zero elements to the back
	for (int i = n - 1; i >= 0; i--) {
		if (arr[i] != 0)
			arr[count--] = arr[i];
	}

	// Fill remaining positions with 0
	while (count >= 0)
		arr[count--] = 0;

	System.out.println(Arrays.toString(arr));
}
}
