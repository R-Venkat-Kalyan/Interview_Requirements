
class MyDetails {

    // Data members
    private String name;
    private int age;

    // Default constructor that will be created, if we don't create any
    // public MyDetails(){ }

    // Non-Parameterized Constructor
    MyDetails(){
        System.out.println("Default Constructor Called !!");
    }

    // Parameterized constructor
    public MyDetails(String name, int age) {
        // Using this keyword to get current object details and initializing data members
        System.out.println("Parameterized Constructor Called !!");
        this.name = name;
        this.age = age;
    }
    
    // Overloaded constructor based on the order of parameters
    public MyDetails(int age, String name) {
        System.out.println("Overloaded Constructor Called !!");
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public MyDetails(MyDetails obj) {
        System.out.println("Copy Constructor Called !!");
        this.name = obj.name;
        this.age = obj.age;
    }
    
    // Member function to print details
    public void printDetails() {
        System.out.println(name + " " + age);
    }
}

public class OOPsTerminology {

    public static void main(String[] args) {

        // Creating object using non-parameterized constructor
        MyDetails obj = new MyDetails();
        obj.printDetails(); // Output will be "null 0" as name and age are not initialized

        // Creating object using parameterized constructor and initializing data members
        MyDetails obj1 = new MyDetails("Kalyan", 21);
        obj1.printDetails(); // Output: Kalyan 21

        // Creating object using overloaded parameterized constructor
        MyDetails obj2 = new MyDetails(21, "Venkat");
        obj2.printDetails(); // Output: Venkat 21

        // Creating object using copy constructor
        MyDetails obj3 = new MyDetails(obj1);
        obj3.printDetails(); // Output: Kalyan 21
    }
}