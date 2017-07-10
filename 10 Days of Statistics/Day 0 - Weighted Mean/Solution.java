/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] elements = new int[size];
        int [] weights  = new int[size];
        for (int i = 0; i < size; i++) {
            elements[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            weights[i] = scan.nextInt();
        }
        scan.close();
        
        /* Calculate weighted mean */
        int total = 0;
        int totalWeights = 0;
        for (int i = 0; i < size; i++) {
            total += elements[i] * weights[i];
            totalWeights += weights[i];
        }
        double weightedMean = (double) total / totalWeights;
        System.out.format("%.1f", weightedMean);
    }
}
