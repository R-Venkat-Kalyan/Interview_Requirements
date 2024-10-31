// Problem Statement:
// Alice climbs a staircase and takes N steps to reach the top. In each turn Alice can climb 1 or M stairs. Find the minimum number of climbs to reach the top i.e. Nth stair.

import java.util.Scanner;

public class StairCaseClimber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int minClimbs = n / m;
        int remainingSteps = n % m;
        System.out.println(minClimbs + remainingSteps);
    }
    
}
