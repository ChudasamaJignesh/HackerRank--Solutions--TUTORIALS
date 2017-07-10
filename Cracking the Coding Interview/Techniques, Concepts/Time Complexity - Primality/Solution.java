/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.util.Scanner;

public class Solution {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        while (p-- > 0) {
            int n = scan.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
        scan.close();
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
