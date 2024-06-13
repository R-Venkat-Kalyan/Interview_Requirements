// Interface A defines a method msg() that classes implementing it must implement.
interface A {
    void msg();  // Interface method declaration
}

// Interface B also defines a method msg() that classes implementing it must implement.
interface B {
    void msg();  // Interface method declaration
}

// Class C implements both interfaces A and B, achieving multiple inheritance of method declarations.
class C implements A, B {

    // Implementing the msg() method from interface A and B
    public void msg() {
        System.out.println("Hello and Welcome");  // Providing a unified behavior for msg()
    }
}

// Main class to demonstrate multiple inheritance through interfaces
public class MultipleInheritanceThroughInterface {

    public static void main(String[] args) {
        C obj = new C();
        obj.msg();  // Outputs "Hello and Welcome"
    }
}

/*
Java doesn't support multiple inheritance of classes. 
The following code snippet is invalid in Java due to ambiguity in method resolution.
class A {
    void msg() {
        System.out.println("Hello");
    }
}

class B {
    void msg() {
        System.out.println("Welcome");
    }
}

class C extends A, B {  // This is not valid in Java
  
    public static void main(String args[]) {  
        C obj = new C();  
        obj.msg();  // Compiler error: ambiguous method call
    }  
}
*/
