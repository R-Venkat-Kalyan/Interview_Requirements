// Define a functional interface with a single abstract method 'say'
interface Sayable {
    void say();
}

// Class containing an instance method
class Say {
    // Instance method to be referred to by method reference
    public void saySomething() {
        System.out.println("Referring to an instance method of a particular object");
    }
}

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        // Creating an instance of the class 'Say'
        Say obj = new Say();

        // Using method reference to refer to the instance method 'saySomething'
        Sayable sayable = obj::saySomething;

        // Calling the method 'say' which will invoke the 'saySomething' method
        sayable.say();
    }
}
