import java.util.Scanner;

class LearnPrimitives {
    public static void printPrimitives() {
        System.out.println("Java has the following primitive DataTypes:");
        System.out.println("byte\tshort\tint\tlong\nfloat\tdouble\nchar\nboolean");

        Scanner sc = new Scanner(System.in); 

        try {
            System.out.println("Enter a byte number between -128 to 127");
            byte dt1 = sc.nextByte();

            System.out.println("Enter a short number between -32768 to 32767");
            short dt2 = sc.nextShort();

            System.out.println("Enter an int number between -2^31 to +2^31-1");
            int dt3 = sc.nextInt();

            System.out.println("Enter a long number between -2^63 to +2^63-1");
            long dt4 = sc.nextLong();

            System.out.println("Enter a floating value like 0.02f");
            float dt5 = sc.nextFloat();

            System.out.println("Enter a double value like 9.23");
            double dt6 = sc.nextDouble();

            System.out.println("Enter a character from a to z");
            char dt7 = sc.next().charAt(0);

            System.out.println("Enter true if you understood primitive data types in Java or else enter false");
            boolean dt8 = sc.nextBoolean();

            if (dt8) {
                System.out.println("Good Job! You have completed learning about primitive data types in Java!!");
            } else {
                System.out.println("OOPS!! You need to practice more about primitive data types in Java");
            }

        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        LearnPrimitives.printPrimitives();
    }
}
