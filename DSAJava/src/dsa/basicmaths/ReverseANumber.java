package dsa.basicmaths;

import java.util.*;

public class ReverseANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input
        int result = solve(n); // process

        System.out.println(result); // output
        sc.close();
    }

    static int solve(int x) {
    	int revN = 0;
        int n = Math.abs(x);
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            revN = (revN * 10) + lastDigit;
        }
        // restore sign
        if (x < 0) {
            revN = -revN;
        }
        System.out.println(revN);
        return revN;
    }
}
