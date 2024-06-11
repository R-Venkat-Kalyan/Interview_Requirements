import java.util.Scanner;

public class StringBuilderExample {

    public static void stringBuilderMethods() {
        // placing Scanner object inside try block to close it automatically
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your First name:");
            String fn = sc.next();
            // creating a StrinBuffer with firstname
            StringBuffer sb = new StringBuffer(fn);
            System.out.println("Enter your Last name:");
            String ln = sc.next();
            // appending first name and last name using append()
            sb.append(" " + ln);
            System.out.println("Enter your Middle name:");
            String mn = sc.next();
            // inserting middle name in between fn & ln using insert()
            sb.insert(fn.length(), " " + mn);
            System.out.println("Your name is: " + sb);
            // reversing your original name using reverse()
            System.out.println("Your name in reversd order: " + sb.reverse());
            // Your name after capitalization using toUpperCase()
            System.out.println("Your name in capital letters: " + sb.reverse().toString().toUpperCase());
            // replacing your first name with 'R' using replace()
            System.out
                    .println("Your name after coverting first name to short form: " + sb.replace(0, fn.length(), "R"));
            // deleting first 3 character of your name using delete()
            System.out.println("Your name after deleting first 3 characters: " + sb.delete(0, 3));
        } catch (Exception e) {
            System.err.println("Some error occured: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mutable, Non-Thread-Safe, Non-Synchronizable, StringBuilder Class !!");
        stringBuilderMethods();
    }

}
