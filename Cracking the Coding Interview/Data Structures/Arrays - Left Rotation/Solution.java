/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[((n- (k%n))+a_i)%n] = in.nextInt();
        }
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
      
        System.out.println();
      
    }
}