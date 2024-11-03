// Sample Input: 5
// Sample Output:
// ABCDE
// ABCD
// ABC
// AB
// A

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pattern8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = n;i >= 1;i--){
            for(int j = 1;j <= i;j++){
                System.out.print((char)(j + 64));
            }
            System.out.println();
        }
    }
}
