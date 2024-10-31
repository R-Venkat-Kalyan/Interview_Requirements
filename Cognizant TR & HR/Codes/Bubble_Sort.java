import java.util.*;
public class Bubble_Sort {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        arr[i] = sc.nextInt();
        System.out.println("Array before sorting: "+Arrays.toString(arr));
        bubbleSort(arr,n);
        System.out.println("Array after sorting: "+Arrays.toString(arr));
    }

    static void bubbleSort(int arr[], int n){
        // Arrays.sort(arr)  sort using built in sort
        // Arrays.sort(arr,1,3) sort arr in certain range
        // Arrays.sort(arr, Collections.reverseOrder()); descending sorting works only for wrapper class: Integer

        for(int i = 0;i < n - 1;i++){
            for(int j = 0;j < n - i - 1;j++){
                if(arr[j] > arr[j+1]){   // sort in ascending order, to sort in descening order change '>' to '<'
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
    }
}
    
}

// Bubble sort is a basic sorting technique which sorts entire array by comparing adjacent elements,
// and swaps them if they are in wrong order. The pass through the array is repeated until the
// array is sorted.
