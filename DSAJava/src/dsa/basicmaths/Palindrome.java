package dsa.basicmaths;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input
        boolean result = solve(n); // process

        System.out.println(result); // output
        sc.close();
    }

    static boolean solve(int x) {
    	 if(x < 0) {return false;}
         int revN = 0;
         int n = Math.abs(x);
         while (n > 0) {
             int lastDigit = n % 10;
             n = n / 10;
             revN = (revN * 10) + lastDigit;
         }
         return (x == revN);
    }
}
