// Sample Input: 5
// Sample Output
// 1     
// 2 3    
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pattern10 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 1; 
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    
}
