// Base class (Parent class)
class Employees {
    int baseSalary = 100000;  // Base salary for any employee
}

// Derived class (Child class) that inherits from Employees
class SoftwareDeveloper extends Employees {
    int bonus = 6000;  // Additional bonus for a software developer
    int ma = 1500;     // Medical allowance for a software developer
    int ota = 3000;    // Over time allowance for a software developer
}

// Another derived class (Child class) that inherits from Employees
class FullStackDeveloper extends Employees {
    int bonus = 7000;  // Additional bonus for a full-stack developer
    int ma = 1000;     // Medical allowance for a full-stack developer
    int ota = 3500;    // Over time allowance for a full-stack developer
}

// Main class to demonstrate hierarchical inheritance(Multiple Derived classes acquiring properties from Single Base class)
public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating an object of SoftwareDeveloper class
        SoftwareDeveloper sd = new SoftwareDeveloper();
        
        // Creating an object of FullStackDeveloper class
        FullStackDeveloper fd = new FullStackDeveloper();
        
        // Calculating and printing the total salary for a Software Developer
        System.out.println("Salary of a Software Developer is " + (sd.baseSalary + sd.bonus + sd.ma + sd.ota) + " per month.");
        
        // Calculating and printing the total salary for a Full-Stack Developer
        System.out.println("Salary of a Full-Stack Developer is " + (fd.baseSalary + fd.bonus + fd.ma + fd.ota) + " per month.");
    }
}
