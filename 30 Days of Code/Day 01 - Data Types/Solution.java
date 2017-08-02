/*  
 *      DeveloperName(): Jignesh Chudasama
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);

        int myInt;
        double myDouble;
        String myString;
        myInt = scan.nextInt();
        myDouble = scan.nextDouble();
        scan.nextLine();
        myString = scan.nextLine();
        System.out.println(i + myInt);
        System.out.println(d + myDouble);

        System.out.println(s + myString);

        scan.close();
    }
}
