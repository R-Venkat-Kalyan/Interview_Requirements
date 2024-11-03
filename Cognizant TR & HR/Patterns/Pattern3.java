// Sample Input: 5
// Sample Output:
// 1  
// 12 
// 123
// 1234
// 12345

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pattern3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
