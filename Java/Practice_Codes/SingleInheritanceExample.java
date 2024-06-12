// Base class (Parent class)
class Employee {
    int baseSalary = 100000;  // Base salary for an employee
}

// Derived class (Child class) that inherits from Employee
class FrontEndDeveloper extends Employee {
    int bonus = 5000;  // Additional bonus for a front-end developer
    int lta = 2000;    // Leave Travel Allowance for a front-end developer
}

// Main class to demonstrate single inheritance(Single Derived class acquiring properties from Single Base class)
public class SingleInheritanceExample {
    public static void main(String[] args) {
        // Creating an object of FrontEndDeveloper class
        FrontEndDeveloper fe = new FrontEndDeveloper();
        
        // Calculating and printing the total salary
        System.out.println("Salary of a front-end developer is " + (fe.baseSalary + fe.bonus + fe.lta) + " per month.");
        // The output includes the base salary from Employee, bonus, and LTA from FrontEndDeveloper
    }
}
