package dsa.recursion;

import java.util.Scanner;


public class FibonacciNumber {
	//Time complexity = 0(2^n);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fibonacciNumber = fib(n); // process

		System.out.println(fibonacciNumber);
		sc.close();
	}

	public static int fib(int n) {
		return findFib(n);
	}

	public static int findFib(int n) {
		if (n <= 1) {
			return n;
		}
		return findFib(n - 1) + findFib(n - 2);
	}

}
