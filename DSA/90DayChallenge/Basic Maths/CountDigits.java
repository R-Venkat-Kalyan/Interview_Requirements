import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        // System.out.println(basicCountDigits(number));
        // System.out.println(normalCountDigits(number));
        System.out.println(optimalCountDigits(number));
        input.close();
    }
    
    public static int basicCountDigits(int number){
        String numberString = String.valueOf(number);
        return numberString.length();
    }

    public static int normalCountDigits(int number){
        int digitsSum = 0;
        while(number > 0){
            digitsSum += 1;
            System.out.print(number+" ");
            number /= 10;
        }
        return digitsSum;
    }

    public static int optimalCountDigits(int number){
        int digitsSum= (int) (Math.log10(number) + 1);
        return digitsSum;
    }


}
