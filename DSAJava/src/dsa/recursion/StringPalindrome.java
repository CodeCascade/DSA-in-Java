package dsa.recursion;

import java.util.Scanner;

//Leetcode problem 125 + Strivers sheet recursion two pointer
//A phrase is a palindrome if,
//after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
//it reads the same forward and backward. Alphanumeric characters include letters and numbers.
public class StringPalindrome {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        boolean isPalindrome = isPalindrome(s); // process
        
        System.out.println(isPalindrome);
        sc.close();
    }
	
	public static boolean isPalindrome(String s) {
        // 1. Remove non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Convert to char array
        char[] c = s.toCharArray();
       
        // 3. Start recursion with index 0
        return palindromeCheck(0, c);
    }

    public static boolean palindromeCheck(int i, char[] c){
        int n = c.length;
        // Base case: pointers crossed or met
        if(i >= n/2){
            return true;
        }

        // If characters don't match
        if(c[i] != c[n-i-1]){
            return false;
        } 

        // Recursive call
        return palindromeCheck(i + 1, c);
    }
	
}
