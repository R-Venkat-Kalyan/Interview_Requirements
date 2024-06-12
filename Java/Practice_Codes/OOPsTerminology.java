class MyDetails{

    // data members
    private String name;
    private int age;

    // Default constructor that will be created, if we don't create any
    // public MyDetails(){ }

    // Non-Parameterized Constructor
    MyDetails(){
        System.out.println("Default Constructor Called !!");
    }

    // Parameterized Constructor
    public MyDetails(String name, int age){
        // using this keyword to get current object deatils and intitializing date memebers.
        System.out.println("Parameterized Constructor Called !!");
        this.name = name;  
        this.age = age;
    }
    
    // Overloading constructor based on the type of parameters.
    public MyDetails(int age,String name){
        System.out.println("Overloaded Constructor Called !!");
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public MyDetails(MyDetails obj){
        System.out.println("Copy Constructor Called !!");
        name = obj.name;
        age = obj.age;

    }
    
    // member function
    public void printDetails(){
        System.out.println(name+" "+age);
    }
}

public class OOPsTerminology {

    public static void main(String[] args) {

        // creating object for Non-Parameterized Constructor
        MyDetails obj = new MyDetails();
        obj.printDetails();

        // creating object for Parameterized Constructor and initializing data members
        MyDetails obj1 = new MyDetails("kalyan",21);
        obj1.printDetails();

        // creating object for Parameterized Constructor and overriding based on data types
        MyDetails obj2 = new MyDetails(21,"venkat");
        obj2.printDetails();

        // creating object for copy constructor
        MyDetails obj3 = new MyDetails(obj1);
        obj3.printDetails();

        
    }
    
}
