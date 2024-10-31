/*Problem Statement:
Alex has an integer array arr of size N and needs to construct an 
alternating prime sequence from the given set of integers for coding 
challenge. For each integer in the array that he is unable to use, his 
penalty increase by the amount of that integer value .An alternating 
prime sequence is defined as a sequence where each prime integer is 
followed by a non-prime integer and each non prime integer in followed 
by a prime one. For example, [1, 2, 4, 3, 6, 5]  is considered to be a 
valid alternating prime sequence while [1, 2, 3, 4, 5, 6] is not a 2 
and 3 are both primes. Note that 1 is considered to be a non-prime 
integer, Your task in to find and print the minimum possible penalty
that Alec can have while completing the task. */
import java.util.*;
public class AlternatePrimeSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> pr = new ArrayList<>();
        List<Integer> npr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            if(isPrime(val))
                pr.add(val);
            else
                npr.add(val);
        }
        Collections.sort(pr,Collections.reverseOrder());
        Collections.sort(npr,Collections.reverseOrder());
        int n1 = pr.size();
        int n2 = npr.size();
        int ans = 0;
        if(n1 == n2 || Math.abs(n1-n2) < 2)
        System.out.println(0);
        else if(n1 > n2){
            if(n2 == 0){
            for(int i = n2;i < n1;i++)
            ans += pr.get(i);
            System.out.println(ans);
            }
            else{
            for(int i = n2+1;i < n1;i++)
            ans += pr.get(i);
            System.out.println(ans);
            }
        }
        else{
            if(n1 == 0){
                for(int i = n1;i < n2;i++)
                ans += npr.get(i);
                System.out.println(ans);
            }
            else{
            for(int i = n1+1;i < n2;i++)
            ans += npr.get(i);
            System.out.println(ans);
            }
        }
    }
    public static boolean isPrime(int n) {
        if(n <= 1)
        return false;
        for(int i = 2;i <=n/2;i++){
            if(n % i == 0)
            return false;
        }
        return true;
    }

    
}
