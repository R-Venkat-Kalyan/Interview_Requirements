// Interface defining the behavior of a Bank Account
interface BankAccount {

    // Abstract method to be implemented by classes that implement this interface
    void deposit(double amount);

    // Abstract method to be implemented by classes that implement this interface
    void withdraw(double amount);

    // Abstract method to be implemented by classes that implement this interface
    double getBalance();

    // Default method with implementation, can be used by all implementing classes
    default void printBalance() {
        System.out.println("The current balance is: " + getBalance());
    }
}

// Concrete class SavingsAccount that implements BankAccount interface
class SavingsAccount implements BankAccount {
    private double balance;

    // Providing implementation for the abstract method deposit
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited to savings account.");
    }

    // Providing implementation for the abstract method withdraw
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from savings account.");
        } else {
            System.out.println("Insufficient balance in savings account.");
        }
    }

    // Providing implementation for the abstract method getBalance
    @Override
    public double getBalance() {
        return balance;
    }
}

// Concrete class CurrentAccount that implements BankAccount interface
class CurrentAccount implements BankAccount {
    private double balance;

    // Providing implementation for the abstract method deposit
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited to current account.");
    }

    // Providing implementation for the abstract method withdraw
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from current account.");
        } else {
            System.out.println("Insufficient balance in current account.");
        }
    }

    // Providing implementation for the abstract method getBalance
    @Override
    public double getBalance() {
        return balance;
    }
}

// Main class to demonstrate abstraction using interfaces
public class AbstractionExample2 {
    public static void main(String[] args) {
        // Creating objects of SavingsAccount and CurrentAccount classes
        BankAccount mySavings = new SavingsAccount();
        BankAccount myCurrent = new CurrentAccount();

        // Performing operations on SavingsAccount
        mySavings.deposit(1000);
        mySavings.withdraw(500);
        mySavings.printBalance();  // Outputs: The current balance is: 500.0
        
        // Performing operations on CurrentAccount
        myCurrent.deposit(2000);
        myCurrent.withdraw(2500);  // Outputs: Insufficient balance in current account.
        myCurrent.printBalance();  // Outputs: The current balance is: 2000.0
    }
}
