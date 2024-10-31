import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LCMPrinter {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        System.out.println("LCM Of "+n1+" and "+n2+" is: "+lcmApproac1(n1, n2));
        System.out.println("LCM Of "+n1+" and "+n2+" is: "+lcmApproach2(n1, n2));

    }

    static int lcmApproac1(int n1, int n2){
        int min = Math.min(n1,n2);
        for(int i = min;i <= 100000;i += min){
            if(i % n1 == 0 && i % n2 == 0){
            return i;
            }
        }
        return -1;
    }

    static int lcmApproach2(int n1, int n2){
        int lcm = (n1 *n2) / gcd(n1,n2);
        return lcm;
    }

    static int gcd(int n1, int n2){
        int min = Math.min(n1,n2);
        for(int i = min;i > 0;i--){
            if(n1 % i == 0 && n2 % i == 0)
            return i;
        }
        return -1;
    }
    
}
