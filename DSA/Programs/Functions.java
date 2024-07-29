import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate and print the sum using the iterative approach
        System.out.println("Sum (iterative) is: " + sum(num1, num2));


        // Pass by Value Example
        int x = 5;
        modifyValue(x);
        System.out.println("Value after modifyValue (pass by value): " + x); // Output will be 5

        // Pass by Reference Example
        Functions obj = new Functions();
        obj.value = 5;
        modifyObject(obj);
        System.out.println("Value after modifyObject (pass by reference): " + obj.value); // Output will be 10
    }

    // Iterative method to calculate the sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }


    // Example method to demonstrate pass by value
    public static void modifyValue(int num) {
        num = 10; // This change will not affect the original argument
    }

    // Example method to demonstrate pass by reference
    public static void modifyObject(Functions obj) {
        obj.value = 10; // This change will affect the original object
    }

    // A field to demonstrate pass by reference
    int value;
}
