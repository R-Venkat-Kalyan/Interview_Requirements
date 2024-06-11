import java.util.Scanner;

// enum Example
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// interface Example
interface Greeting{
    void greet();
}

// class implementing interface
class PersonalGreeting implements Greeting{

    public void greet(){
        System.out.println("Hello");
    }

}

// class demonstrating non-primitive data types
class LearnNonPrimitives{

    public static void printNonPrimitives(){
        Scanner sc = new Scanner(System.in);
        try {
            // String example
            System.out.println("Enter a string:");
            String str = sc.nextLine();
            System.out.println("You entered: " + str);

            // Hardcoding Array values
            int[] arr = new int[]{1,2,3};
            int arr1[] = {1,2,3};

            // Array example
            System.out.println("Enter the number of elements for the integer array:");
            int n = sc.nextInt();
            int[] intArray = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                intArray[i] = sc.nextInt();
            }
            System.out.print("Array elements: ");
            for (int num : intArray) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Enum example
            System.out.println("Enter a day of the week (e.g., MONDAY):");
            sc.nextLine(); // Consume newline left-over
            String dayInput = sc.nextLine();
            Day day = Day.valueOf(dayInput.toUpperCase());
            System.out.println("You entered: " + day);

            // Class example
            PersonalGreeting greeting = new PersonalGreeting();
            greeting.greet();

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

// Main class 
public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        LearnNonPrimitives.printNonPrimitives();
        
    }
    
}
