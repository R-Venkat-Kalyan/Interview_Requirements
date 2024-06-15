// Define a functional interface with a single abstract method 'say'
interface Sayable {
    void say();
}

public class MethodReferenceExample1 {

    // A static method that we want to refer to using method reference
    public static void saySomething() {
        System.out.println("Referring to a static method using method reference");
    }

    public static void main(String[] args) {
        // Using method reference to refer to the static method 'saySomething'
        Sayable sayable = MethodReferenceExample1::saySomething;

        // Calling the method 'say' which will invoke the 'saySomething' method
        sayable.say();
    }
}
