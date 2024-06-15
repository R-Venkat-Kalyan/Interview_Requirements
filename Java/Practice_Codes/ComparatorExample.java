import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Class representing student details
class Students {
    int id; // Student ID
    String name; // Student name
    char gender; // Student gender
    double cgpa; // Student CGPA

    // Constructor to initialize student details
    Students(int id, String name, char gender, double cgpa) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.cgpa = cgpa;
    }
}

// Comparator class to sort students by ID
class IdComparator implements Comparator<Students> {
    public int compare(Students s1, Students s2) {
        if (s1.id == s2.id)
            return 0;
        else if (s1.id > s2.id)
            return 1;
        else
            return -1;

        // The above implementation can be simplified to:
        // return Integer.compare(s1.id, s2.id);
    }
}

// Comparator class to sort students by name
class NameComparator implements Comparator<Students> {
    public int compare(Students s1, Students s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Comparator class to sort students by gender
class GenderComparator implements Comparator<Students> {
    public int compare(Students s1, Students s2) {
        return Character.compare(s1.gender, s2.gender);
    }
}

// Comparator class to sort students by gender
class CgpaComparator implements Comparator<Students> {
    public int compare(Students s1, Students s2) {
        return Double.compare(s1.cgpa, s2.cgpa);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        // Create a list of Students objects
        List<Students> details = new ArrayList<>();
        details.add(new Students(25, "MVK", 'f', 78.23));
        details.add(new Students(102, "RVK", 'm', 69.72));
        details.add(new Students(42, "GP", 'f', 75.13));
        details.add(new Students(103, "MVV", 'm', 72.10));

        // Sort the list of students based on ID using IdComparator
        Collections.sort(details, new IdComparator());

        // Print the sorted student details
        System.out.println("Sorted by ID:");
        for (Students st : details) {
            System.out.println(st.id + " " + st.name + " " + st.gender + " " + st.cgpa);
        }

        // Sort the list of students based on name using NameComparator
        Collections.sort(details, new NameComparator());

        // Print the sorted student details
        System.out.println("\nSorted by Name:");
        for (Students st : details) {
            System.out.println(st.id + " " + st.name + " " + st.gender + " " + st.cgpa);
        }

        // Sort the list of students based on gender using GenderComparator
        Collections.sort(details, new GenderComparator());

        // Print the sorted student details
        System.out.println("\nSorted by Gender:");
        for (Students st : details) {
            System.out.println(st.id + " " + st.name + " " + st.gender + " " + st.cgpa);
        }

        // Sort the list of students based on CGPA using CgpaComparator
        Collections.sort(details, new CgpaComparator());

        // Print the sorted student details
        System.out.println("\nSorted by CGPA:");
        for (Students st : details) {
            System.out.println(st.id + " " + st.name + " " + st.gender + " " + st.cgpa);
        }
    }
}
