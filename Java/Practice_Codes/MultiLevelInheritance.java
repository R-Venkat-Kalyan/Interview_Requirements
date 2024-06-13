// Base class (Parent class)
class Employ {
    int base_salary = 100000;  // Base salary for any employee
}

// Intermediate class that inherits from Employ (Parent class)
class UIDesigner extends Employ {
    int bonus = 4000;  // Additional bonus for a UI designer
    int pa = 1000;     // Project allowance for a UI designer
}

// Derived class that inherits from UIDesigner (Intermediate class)
class WebDeveloper extends UIDesigner {
    int hra = 3000;    // House rent allowance for a web developer
}

// Main class to demonstrate multi-level inheritance
// (A Derived Class inheriting a Base class and also acts as a Base class for another Derived Class)
public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Creating an object of WebDeveloper class
        WebDeveloper wd = new WebDeveloper();
        
        // Calculating and printing the total salary for an employee who is both a UI Designer and a Web Developer
        System.out.print("Salary of an Employ who is a UI Designer and also a Web Developer is: ");
        System.out.print(wd.base_salary + wd.bonus + wd.pa + wd.hra+" per month");  // Summing up all the allowances and base salary
    }
}
