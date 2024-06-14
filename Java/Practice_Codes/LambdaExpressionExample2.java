
// Define a functional interface named Greeting with a single abstract method greet
interface Greeting {
    public String greet(String name);
}

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        // Implement the Greeting interface using a lambda expression
        // This lambda expression takes a name as input and returns a greeting message
        Greeting g = (name) -> "Welcome " + name;
        
        // Call the greet method and print the result
        System.out.println(g.greet("Kalyan"));  // Outputs: Welcome Kalyan

        // Another implementation of the Greeting interface using a lambda expression
        // This lambda expression provides a different greeting message
        Greeting g2 = (name) -> {
            return "Hello, " + name + "! Have a great day!";
        };
        
        // Call the greet method of the second implementation and print the result
        System.out.println(g2.greet("Kalyan"));  // Outputs: Hello, Kalyan! Have a great day!

        // A third implementation of the Greeting interface using a lambda expression
        // This lambda expression provides yet another greeting message
        Greeting g3 = (name) -> {
            return "Hi " + name + ", nice to meet you!";
        };
        
        // Call the greet method of the third implementation and print the result
        System.out.println(g3.greet("Kalyan"));  // Outputs: Hi Kalyan, nice to meet you!
    }
}


/*
The same implementation with out lambda Expression

 * @FunctionalInterface
// Define a functional interface named Greeting with a single abstract method greet
interface Greeting {
    public String greet(String name);
}

public class LambdaExpressionExampleWithoutLambda {
    public static void main(String[] args) {
        // Implement the Greeting interface using an anonymous inner class
        Greeting g = new Greeting() {
            @Override
            public String greet(String name) {
                return "Welcome " + name;
            }
        };
        
        // Call the greet method and print the result
        System.out.println(g.greet("Kalyan"));  // Outputs: Welcome Kalyan

        // Another implementation of the Greeting interface using an anonymous inner class
        Greeting g2 = new Greeting() {
            @Override
            public String greet(String name) {
                return "Hello, " + name + "! Have a great day!";
            }
        };
        
        // Call the greet method of the second implementation and print the result
        System.out.println(g2.greet("Kalyan"));  // Outputs: Hello, Kalyan! Have a great day!

        // A third implementation of the Greeting interface using an anonymous inner class
        Greeting g3 = new Greeting() {
            @Override
            public String greet(String name) {
                return "Hi " + name + ", nice to meet you!";
            }
        };
        
        // Call the greet method of the third implementation and print the result
        System.out.println(g3.greet("Kalyan"));  // Outputs: Hi Kalyan, nice to meet you!
    }
}

/*
Need for Lambda Expressions:
Anonymous Inner Classes: The above code uses anonymous inner classes to implement the Greeting interface. While this approach works, it is verbose and repetitive. Each anonymous inner class implementation requires the following:

1. Class Definition: Even though it's an inner class, we need to define the class structure.
2. Method Implementation: We need to explicitly override the greet method.
3. Boilerplate Code: Each implementation contains repetitive boilerplate code.
*/
