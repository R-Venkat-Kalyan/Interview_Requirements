// Problem Statement –
// A supermarket maintains a pricing format for all its products. A value N is printed on each product. When the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. The task here is to design the software such that given the code of any item N the product (multiplication) of all the digits of value should be computed(price).

// Example 1:

// Input : 5244 -> Value of N
// Output : 160 -> Price 

// Explanation:
// From the input above 
// Product of the digits 5,2,4,4
// 5*2*4*4= 160

import java.util.Scanner;
public class Question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 1;
        for(int i = 0;i < s.length();i++){
            int val = s.charAt(i) - '0';
            ans *= val;
        }
        System.out.println(ans);
    }
    
}
