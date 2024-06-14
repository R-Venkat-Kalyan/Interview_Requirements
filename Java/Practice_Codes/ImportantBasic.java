public class ImportantBasic {

    // The main method serves as the entry point for the program
    public static void main(String... args) {
        System.out.println("Program started."); // Print a message indicating the program has started

        // Print a message indicating the sum calculation
        System.out.println("Sum of provided numbers is");
        // Check if any command-line arguments are provided
        if (args.length > 0) {
            int sum = 0; // Initialize sum to 0

            // Iterate through each command-line argument
            for (String arg : args) {
                // Parse the argument as an integer and add it to the sum
                sum += Integer.parseInt(arg);
            }
            // Print the calculated sum
            System.out.println(sum);
        }
        else{
            System.err.println("No arguments found !!");
        }
    }
    
    /*
    Steps to Execute the Program:

    1. Write the Code:
       Save the code in a file named ImportantBasic.java.

    2. Compile the Code:
       Open a terminal or command prompt and navigate to the directory where ImportantBasic.java is saved.
       Then, compile the code using the following command:
       
       javac ImportantBasic.java

    3. Run the Program:
       After successful compilation, run the program with or without command-line arguments.

       - Without Command-Line Arguments:
         
         java ImportantBasic
         
         Output:
         Program started.
         Sum of provided numbers is
         0
         
       - With Command-Line Arguments (e.g., 10, 20, and 30):
         
         java ImportantBasic 10 20 30
         
         Output:
         Program started.
         Sum of provided numbers is
         60
    */
}
