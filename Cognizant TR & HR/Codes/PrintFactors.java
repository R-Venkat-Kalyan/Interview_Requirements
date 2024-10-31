import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintFactors {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printFactorsApproach1(n);
    }

    static void printFactorsApproach1(int n){
        for(int i = 1;i <= n;i++){
            if(n % i == 0)
            System.out.print(i+" ");
        }
    }
}
