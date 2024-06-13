// Calculator class with methods to demonstrate compile-time polymorphism
class Calculator {

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method overloading: method to multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method overloading: method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class to demonstrate compile-time polymorphism
public class CompileTimePolymorphism {

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        // Calling multiply(int, int) method: resolves to the appropriate method at compile-time based on arguments
        System.out.println("Product of 10 & 20 is: " + obj.multiply(10, 20));

        // Calling multiply(double, double) method: resolves to the appropriate method at compile-time based on arguments
        System.out.println("Product of 10.2, 20.1 is: " + obj.multiply(10.2, 20.1));

        // Calling add(int, int) method: resolves to the appropriate method at compile-time based on arguments
        System.out.println("Sum of 10 & 20: " + obj.add(10, 20));

        // Calling add(int, int, int) method: resolves to the appropriate method at compile-time based on arguments
        System.out.println("Sum of 10, 20 & 30: " + obj.add(10, 20, 30));
    }
}
