import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        // int absNum = Math.abs(num);
        int reversedNum = reverseNumber(num);
        if(num == reversedNum)
        System.out.println("Palindrome");
        else
        System.out.println("Not");
    }

    public static int reverseNumber(int num){
        if(num == 0)
            return 0;
        int rev = 0;
        while(num > 0){
            int ld = num % 10;
            rev = (rev * 10) + ld;
            num /= 10;
        }
        return rev;
    }
    
}
