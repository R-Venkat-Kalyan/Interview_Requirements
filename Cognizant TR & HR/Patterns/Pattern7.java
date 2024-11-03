// Sample Input: 5
// Sample Output:
// A
// BB
// CCC
// DDDD
// EEEEE

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pattern7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}
