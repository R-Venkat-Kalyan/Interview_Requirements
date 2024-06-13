

// Base class (Parent class)
class Employ {
    int base_salary = 100000;  // Base salary for any employee
}

// Intermediate class that inherits from Employ (Parent class) - Single Inheritance
class UIDesigner extends Employ {
    int bonus = 4000;  // Additional bonus for a UI designer
    int pa = 1000;     // Project allowance for a UI designer
}

// Interface to provide bonus
interface BonusProvider {
    int getBonus();
}

// Interface to provide allowance
interface AllowanceProvider {
    int getAllowance();
}

// Derived class that inherits from UIDesigner and implements multiple interfaces - Hybrid Inheritance
class WebDeveloper extends UIDesigner implements BonusProvider, AllowanceProvider {
    int hra = 3000;  // House rent allowance for a web developer

    // Implementing getBonus method from BonusProvider interface
    @Override
    public int getBonus() {
        return bonus;
    }

    // Implementing getAllowance method from AllowanceProvider interface
    @Override
    public int getAllowance() {
        return hra + pa;  // Sum of HRA and Project Allowance
    }
}

// Main class to demonstrate hybrid inheritance
public class HybridInheritanceExample {
    public static void main(String[] args) {
        // Creating an object of WebDeveloper class
        WebDeveloper wd = new WebDeveloper();
        
        // Calculating and printing the total salary for an employee who is both a UI Designer and a Web Developer
        int totalSalary = wd.base_salary + wd.getBonus() + wd.getAllowance();
        System.out.println("Salary of an Employ who is a UI Designer and also a Web Developer is: " + totalSalary + " per month.");
    }
}

