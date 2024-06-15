// Define a functional interface with a single abstract method 'say'
interface Sayable {
    Say1 say(String saying);
}

// Class with a constructor that takes a string argument
class Say1 {
    // Constructor that prints the given string
    Say1(String saying) {
        System.out.println(saying);
    }
}

public class MethodReferenceExample4 {
    public static void main(String[] args) {
        // Using a constructor reference to refer to the 'Say1' constructor
        Sayable obj = Say1::new;

        // Calling the method 'say' which will invoke the 'Say1' constructor
        obj.say("Referring to a Constructor");
    }
}
