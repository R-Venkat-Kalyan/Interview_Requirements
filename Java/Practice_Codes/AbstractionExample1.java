// Abstract class representing a general Animal
abstract class Animal {
    
    // Abstract method to be implemented by subclasses
    abstract void sound();

    // Concrete method (with implementation) that can be used by all subclasses
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Concrete class Dog that extends Animal
class Dog extends Animal {

    // Providing implementation for the abstract method sound
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

// Concrete class Cat that extends Animal
class Cat extends Animal {

    // Providing implementation for the abstract method sound
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

// Main class to demonstrate abstraction
public class AbstractionExample1 {
    public static void main(String[] args) {

        // Creating objects of Dog and Cat classes
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the implemented sound method on Dog object
        myDog.sound();  // Outputs: The dog barks.
        
        // Calling the implemented sound method on Cat object
        myCat.sound();  // Outputs: The cat meows.
        
        // Calling the concrete method sleep on Dog and Cat objects
        myDog.sleep();  // Outputs: This animal is sleeping.
        myCat.sleep();  // Outputs: This animal is sleeping.
    }
}
