import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0, st = 1;
        while(st < n){
            st = st << 1;
            c += 1;
        }
        if(st == n)
        System.out.println(c);
        else
        System.out.println(-1);
    }
    
}
