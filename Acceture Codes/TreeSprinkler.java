/* Problem Statement:
// There are exactly N trees on a number line. Each tree stands at a 
unique integral point T[i]. Exactly M water sprinklers are also placed 
on the same number line, with each placed at a unique integral point 
S[i]. A point can contain a tree as well as a water sprinkler. A water 
sprinkler can provide its water to the trees, which are not more than 
k units far in both directions from the water sprinkler. If k=0, then 
the water sprinkler will only provide its water to the tree at the same
point. Your task is to find the minimum value of k such that all the 
trees receive water from the water sprinklers. */

import java.util.*;

public class TreeSprinkler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] trees = new int[n];
        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int[] sprinklers = new int[m];
        for (int j = 0; j < m; j++) {
            sprinklers[j] = sc.nextInt();
        }
        
        List<Integer> res = new ArrayList<>();
        
       
        for (int i = 0; i < n; i++) {
            int minDistance = Integer.MAX_VALUE;
            
            for (int j = 0; j < m; j++) {
                int distance = Math.abs(trees[i] - sprinklers[j]);
                minDistance = Math.min(minDistance, distance);
            }
            
            res.add(minDistance);
        }

        int maxDistance = Collections.max(res);
        System.out.println(maxDistance);
    }
}
