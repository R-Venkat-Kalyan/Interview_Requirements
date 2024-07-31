import java.util.Scanner;
public class Patterns {

    // pattern1: Rectangular Pattern
    // practice link : https://takeuforward.org/pattern/pattern-1-rectangular-star-pattern/
    public static void printRectangularPattern(int n){
       
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern-2: Right-Angled Triangle Pattern
    // practice link : https://takeuforward.org/pattern/pattern-2-right-angled-triangle-pattern/
    public static void rightAngledTrianglePattern(int n){
        
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern-3: Right-Angled Number Pyramid
    // practice link : https://takeuforward.org/pattern/pattern-3-right-angled-number-pyramid/
    public static void rightAngledNumberPyramid(int n){

        for(int i = 01;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Pattern-4: Right-Angled Number Pyramid-ii
    // practice link : https://takeuforward.org/pattern/pattern-4-right-angled-number-pyramid-ii/
    public static void rightAngledNumberPyramid2(int n){
        
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //Pattern-5: Inverted Right Pyramid
    // practice link : https://takeuforward.org/pattern/pattern-5-inverted-right-pyramid//
    public static void invertedRightPyramid(int n){
        
        for(int i = n;i > 0;i--){
            for(int j = i;j > 0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern-6: Inverted Number Right Pyramid
    // practice link : https://takeuforward.org/pattern/pattern-6-inverted-numbered-right-pyramid/
    public static void invertedNumberRightPyramid(int n){
        
        for(int i = n;i > 0;i--){
            for(int j = 1;j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Pattern-7: Inverted Number Right Pyramid
    // practice link : https://takeuforward.org/pattern/pattern-7-star-pyramid/
    public static void sevenStarPyramid(int n){
        
        {
            // This is the outer loop which will loop for the rows.
            for (int i = 0; i < n; i++)
            {
                // For printing the spaces before stars in each row
                for (int j =0; j<n-i-1; j++)
                {
                    System.out.print(" ");
                }
               
                // For printing the stars in each row
                for(int j=0;j< 2*i+1;j++){
                    
                    System.out.print("*");
                }
                
                // For printing the spaces after the stars in each row
                 for (int j =0; j<n-i-1; j++)
                {
                    System.out.print(" ");
                }
               
                // As soon as the stars for each iteration are printed, we move to the
                // next row and give a line break otherwise all stars
                // would get printed in 1 line.
                System.out.println();
            }
        }
    }

    //Pattern-8: Inverted Star Pyramid
    // practice link : https://takeuforward.org/pattern/pattern-8-inverted-star-pyramid/
    public static void invertedStarPyramid(int n){
        
        // This is the outer loop which will loop for the rows.
    for (int i = 0; i < n; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*n -(2*i +1);j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
        for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
       

        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        System.out.println();
    }
    }
    
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
       invertedStarPyramid(7);
    }
    
}
