import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class representing student details and implementing Comparable interface for sorting
class StudentDetails implements Comparable<StudentDetails> {

    int id;            // Student ID
    String name;       // Student name
    char gender;       // Student gender
    double cgpa;       // Student CGPA

    // Constructor to initialize student details
    StudentDetails(int id, String name, char gender, double cgpa) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.cgpa = cgpa;
    }

    // Method to compare two StudentDetails objects based on their IDs (ascending order)
    public int compareTo(StudentDetails st) {
        if (this.id == st.id) return 0;
        else if (this.id > st.id) return 1;
        else return -1;

        // The above can be simplified to:
        // return Integer.compare(this.id, st.id);
    }

    // Uncomment the following methods to sort based on other fields

    // Method to compare two StudentDetails objects based on their IDs (descending order)
    /*
    public int compareTo(StudentDetails st) {
        return Integer.compare(st.id, this.id);
    }
    */

    // Method to compare two StudentDetails objects based on their CGPA (ascending order)
    /*
    public int compareTo(StudentDetails st) {
        return Double.compare(this.cgpa, st.cgpa);
    }
    */

    // Method to compare two StudentDetails objects based on their CGPA (descending order)
    /*
    public int compareTo(StudentDetails st) {
        return Double.compare(st.cgpa, this.cgpa);
    }
    */

    // Method to compare two StudentDetails objects based on their gender (ascending order)
    /*
    public int compareTo(StudentDetails st) {
        return Character.compare(this.gender, st.gender);
    }
    */

    // Method to compare two StudentDetails objects based on their gender (descending order)
    /*
    public int compareTo(StudentDetails st) {
        return Character.compare(st.gender, this.gender);
    }
    */

    // Method to compare two StudentDetails objects based on their names (ascending order)
    /*
    public int compareTo(StudentDetails st) {
        return this.name.compareTo(st.name);
    }
    */

    // Method to compare two StudentDetails objects based on their names (descending order)
    /*
    public int compareTo(StudentDetails st) {
        return st.name.compareTo(this.name);
    }
    */

    // Method to compare two StudentDetails objects based on the length of their names (ascending order)
    /*
    public int compareTo(StudentDetails st) {
        return Integer.compare(this.name.length(), st.name.length());
    }
    */

    // Method to compare two StudentDetails objects based on the length of their names (descending order)
    /*
    public int compareTo(StudentDetails st) {
        return Integer.compare(st.name.length(), this.name.length());
    }
    */
}

// Main class to demonstrate sorting of StudentDetails objects
public class ComparableExample {
    public static void main(String[] args) {

        // Create a list of StudentDetails objects
        List<StudentDetails> details = new ArrayList<>();
        details.add(new StudentDetails(25, "MVK", 'f', 78.23));
        details.add(new StudentDetails(102, "RVK", 'm', 69.72));
        details.add(new StudentDetails(42, "GP", 'f', 75.13));
        details.add(new StudentDetails(103, "MVV", 'm', 72.10));

        // Sort the list of students based on the compareTo method in StudentDetails class
        Collections.sort(details);

        // Print the sorted student details
        for (StudentDetails st : details) {
            System.out.println(st.id + " " + st.name + " " + st.gender + " " + st.cgpa);
        }
    }
}
