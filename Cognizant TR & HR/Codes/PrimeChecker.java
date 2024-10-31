import java.util.Scanner;
public class PrimeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
        System.out.println(n+" is a Prime Number");
        else
        System.out.println(n+" is not a Prime Number");
    }

    static boolean isPrime(int n){
        if (n <= 1)
        return false;
    // Only check divisors up to √n. If n has any divisor larger than √n, 
    // it must also have a smaller divisor, so we can stop at √n to save time.        
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0)
            return false;
        }
        return true;
    }
    
}
