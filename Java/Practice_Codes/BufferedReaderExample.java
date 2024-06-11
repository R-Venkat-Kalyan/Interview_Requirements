import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) throws Exception {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Your Name: ");
            String name = br.readLine();
            System.err.println("Enter your ID: ");
            int id = Integer.parseInt(br.readLine());
            System.err.println("Enter your age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.println("Enter Your CGPA: ");
            float cgpa = Float.parseFloat(br.readLine());
            System.out.println("Your Details are: "+name+" "+id+" "+age+" "+cgpa);

        } catch (Exception e) {
            System.err.println("An error Occured: " + e.getMessage());
        }

    }

}
