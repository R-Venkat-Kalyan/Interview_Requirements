import java.util.Scanner;

public class UniqueString {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (i < 2 || !(s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2))) {
                res += s.charAt(i);
            }
        }

        System.out.println(res);
    }
    
}
