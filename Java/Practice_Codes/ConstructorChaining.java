class Details {

    // Data members to store the name and age of the person
    private String name;
    private int age;

    // Non-Parameterized Constructor
    // Calls the overloaded constructor with default values and prints a message
    Details() {
        this("Kalyan", 21); // Calls the parameterized constructor with default values
        System.out.println("Default Constructor Called !!");
    }

    // Parameterized Constructor
    // Initializes data members with provided values and prints a message
    public Details(String name, int age) {
        // Calls the overloaded constructor to demonstrate constructor chaining
        this(21, "venkat");
        System.out.println("Parameterized Constructor Called using Constructor Chaining !!");
        
        // Sets the data members with the provided values
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }

    // Overloaded Constructor
    // Initializes data members and prints a message
    public Details(int age, String name) {
        System.out.println("Overloaded Constructor Called using Constructor Chaining !!");
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }

}

public class ConstructorChaining {
    public static void main(String[] args) {
        // Creating an instance of Details class
        // This will invoke the non-parameterized constructor, demonstrating constructor chaining
        new Details();
    }
}
