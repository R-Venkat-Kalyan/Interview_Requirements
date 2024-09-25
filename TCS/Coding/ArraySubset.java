import java.util.HashMap;
import java.util.Map;

public class ArraySubset {

    public static void main(String[] args) {
        long a1[] = {1, 2, 3, 4, 4, 5, 6};
        long a2[] = {1, 2, 3, 4};
        long n = a1.length;
        long m = a2.length;
        System.out.println(isSubset(a1,a2,n,m));
    }


    public static String isSubset(long a1[], long a2[], long n, long m) {
        // Map to store the frequency of elements in a1
        Map<Long, Long> mp = new HashMap<>();
        
        // Map to store the frequency of elements in a2
        Map<Long, Long> mp1 = new HashMap<>();
        
        // Populate mp with frequency counts of elements in a1
        for(int i = 0; i < n; i++) {
            mp.put(a1[i], mp.getOrDefault(a1[i], 0L) + 1);  // No casting needed
        }

        // Populate mp1 with frequency counts of elements in a2
        for(int j = 0; j < m; j++) {
            mp1.put(a2[j], mp1.getOrDefault(a2[j], 0L) + 1);  // No casting needed
        }

        // Check if every element in a2 (mp1) exists in a1 (mp) with the same or greater frequency
        for(Long val : mp1.keySet()) {
            // If an element in a2 is not present in a1 or its count in a2 exceeds its count in a1, return "No"
            if (!mp.containsKey(val) || mp.get(val) < mp1.get(val)) {
                return "No";
            }
        }

        // If all elements in a2 are accounted for, return "Yes"
        return "Yes";
    }
    
}
