package dsa.sorting;

import java.util.Scanner;

//Time Complexity => O(N^2) for average & worst case , & O(N) for sorted array that is the best case scenario
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = n - 1; i <= 0; i--) {
			int didSwap = 0;   //optimization
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
			
			if(didSwap == 0) {
				break;
			}
			    
		}

		// print the sorted array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
