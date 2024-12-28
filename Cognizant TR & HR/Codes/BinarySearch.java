import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {
     public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for(int i = 0;i < n;i++)
        arr[i] = Integer.parseInt(br.readLine());
        int key = Integer.parseInt(br.readLine());

        if(isPresent(arr, key) == -1)
        System.out.println("key is not present "+key);
        else{
            System.out.println(isPresent(arr,key));
        }
     }
     public static int isPresent(int arr[], int key){
        int l = 0, r = arr.length-1;
        while(l <= r){
            // int mid = left + (right - left) / 2;
            int m = (l + r) / 2;
            if(arr[m] == key)
            return m;
            else if(key < arr[m]){
                r = m - 1;
            }
            else
            l = m + 1;
        }
        return -1;
     }
}
