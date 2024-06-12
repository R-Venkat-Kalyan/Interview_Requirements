class Details{

    // data members
    private String name;
    private int age;

    // Non-Parameterized Constructor
    Details(){
        this("Kalyan",21);
        System.out.println("Default Constructor Called !!");
    }

    // Parameterized Constructor
    public Details(String name, int age){
        // using this keyword to get current object deatils and intitializing date memebers.
        this(21,"venkat");
        System.out.println("Parameterized Constructor Called using Constructor Chaining !!");
        this.name = name;  
        this.age = age;
        System.out.println(name+" "+age);
    }
    
    // Overloading constructor based on the type of parameters.
    public Details(int age,String name){
        System.out.println("Overloaded Constructor Called using Constructor Chaining !!");
        this.name = name;
        this.age = age;
        System.out.println(name+" "+age);
    }
    
}

public class ConstructorChaining {
    public static void main(String[] args) {
        // invoking non-parameterized constructor anf implementing constructor chaining
         new Details();
    }
}
