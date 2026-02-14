package dsa.sorting;

import java.util.Scanner;

//Strivers sheet - sorting-I
//Time Complexity => O(N^2)
public class SelectionSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i <= n - 2; i++) {
			int min = i;
			for (int j = i; j <= n - 1; j++) {
				if (arr[j] < arr[min]) {
					// swap
					int temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// print the sorted array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
