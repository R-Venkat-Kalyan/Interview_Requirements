import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceExample3 {
    public static void main(String[] args) {
        // Create a list of courses
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("OS");
        courses.add("cns");
        courses.add("DBMS");

        // Sort the list of courses using a method reference to the String's compareToIgnoreCase method
        Collections.sort(courses, String::compareToIgnoreCase);

        // Print each course in the sorted list using a method reference to System.out's println method
        courses.forEach(System.out::println);
    }
}
