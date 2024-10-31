import java.util.Scanner;

public class ReduceNToOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input integer n
        int n = sc.nextInt();

        // Check and print the result based on the value of n
        if (n <= 3) {
            System.out.println(n - 1);
        } else {
            if (n % 2 == 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

       
    }
    
}
