import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwapTwoNumbers {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        swapApproach1(num1, num2);
        swapApproach2(num1, num2);
        swapApproach3(num1, num2);
    }

    static void swapApproach1(int num1,int num2){
        System.out.println("Before Swappig: Num1 = "+num1+" Num2 = "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swappig: Num1 = "+num1+" Num2 = "+num2);

    }

    static void swapApproach2(int num1,int num2){
        System.out.println("Before Swappig: Num1 = "+num1+" Num2 = "+num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swappig: Num1 = "+num1+" Num2 = "+num2);

    }

    static void swapApproach3(int num1,int num2){
        System.out.println("Before Swappig: Num1 = "+num1+" Num2 = "+num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After Swappig: Num1 = "+num1+" Num2 = "+num2);

    }
    
}
