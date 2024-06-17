// Java program to illustrate Constructor Chaining to
// other class using super() keyword

// Base class
class Base {
    String name;

    // No-argument constructor 1
    Base() {
        System.out.println("No-argument constructor of base class");
    }

    // Parameterized constructor 2
    Base(String name) {
        this(); // Calls the no-argument constructor of the base class
        this.name = name;
        System.out.println("Calling parameterized constructor of base: " + name);
    }
}

// Derived class extending Base class
class Derived extends Base {
    // No-argument constructor 3
    Derived() {
        System.out.println("No-argument constructor of derived");
    }

    // Parameterized constructor 4
    Derived(String name) {
        super(name); // Calls the parameterized constructor of the base class
        System.out.println("Calling parameterized constructor of derived");
    }
}

public class ConstructorChainingSuper {
    public static void main(String[] args) {
        // Creating an instance of Derived class with a parameter
        // This will invoke the parameterized constructor of the derived class
        // and subsequently, the parameterized constructor of the base class
        new Derived("Kalyan");
    }
}
