import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pattern6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 5;i >= 1;i--){
            for(int j = 1;j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}