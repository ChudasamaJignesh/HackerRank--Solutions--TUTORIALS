/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

/* Useful Formulas: -- by Admin
    https://www.hackerrank.com/challenges/s10-poisson-distribution-2/forum/comments/175398
    https://www.hackerrank.com/challenges/s10-poisson-distribution-2/forum/comments/176962
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        scan.close();
        
        /* E[x^2] = lambda + lambda^2. */
        double dailyCostA = 160 + 40 * (A + (A * A));
        double dailyCostB = 128 + 40 * (B + (B * B));

        /* Print output */
        System.out.format("%.3f%n", dailyCostA);
        System.out.format("%.3f%n", dailyCostB);
    }
}
