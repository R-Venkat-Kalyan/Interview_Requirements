// Parent class with a method to demonstrate runtime polymorphism
class Parent {
    void print() {
        System.out.println("Hello I am from Parent Class.");
    }
}

// Child1 class that extends Parent and overrides the print() method
class Child1 extends Parent {
    @Override
    void print() {
        System.out.println("Hello I am from Child1 Class.");
    }
}

// Child2 class that extends Parent and overrides the print() method
class Child2 extends Parent {
    @Override
    void print() {
        System.out.println("Hello I am from Child2 Class.");
    }
}

// Main class to demonstrate runtime polymorphism
public class RunTimePolymorphism {
    public static void main(String[] args) {

        // Reference variable of type Parent
        Parent a;

        // a refers to an object of Child1 and calls the overridden print() method
        a = new Child1();
        a.print();  // Outputs: "Hello I am from Child1 Class."

        // a refers to an object of Child2 and calls the overridden print() method
        a = new Child2();
        a.print();  // Outputs: "Hello I am from Child2 Class."
    }
}
