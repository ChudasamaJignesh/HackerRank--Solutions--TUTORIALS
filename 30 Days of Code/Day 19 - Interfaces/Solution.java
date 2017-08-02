/*  
 *      DeveloperName(): Jignesh Chudasama
 */
import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    
    public int divisorSum(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) { 
                sum += i + n/i; 
            }
        }
        if (sqrt * sqrt == n) {
            sum -= sqrt;
        }
        return sum;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
