package dsa.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				// swap
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}

		// print the sorted array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

}
