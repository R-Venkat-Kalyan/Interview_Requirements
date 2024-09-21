// Problem Statement –
// Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.

// Constrains-
// 1<=N<=100

// Example 1:

// Input : 10  -> Integer
// Output : 5    -> result- Integer


import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String bin = Integer.toBinaryString(n);
    char ch[] = bin.toCharArray();
    for(int i = 0;i < ch.length;i++){
        if(ch[i] == '1')
            ch[i] = '0';
        else if(ch[i] == '0')
            ch[i] = '1';
    }
    String ans = new String(ch);
    System.out.println(Integer.parseInt(ans,2));
}
    
}
