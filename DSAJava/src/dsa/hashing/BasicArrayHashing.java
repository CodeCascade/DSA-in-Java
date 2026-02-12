package dsa.hashing;

import java.util.Scanner;

public class BasicArrayHashing {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   int n = sc.nextInt();
	   int[] arr = new int[n];
	   for(int i=0; i<n; i++) {
		   arr[i] = sc.nextInt();
	   }
	   
	   //preCompute
	   int[] hash = new int[13];
	   for(int i = 0; i<n; i++) {
		   hash[arr[i]] += 1; 
	   }
	   
	   int q = sc.nextInt(); //for no. of fetch function to be used.
	   while(q-- != 0) {
		   int number = sc.nextInt();
		   //fetching
		   System.out.println(hash[number]);
	   }
	   sc.close();
   }
}
