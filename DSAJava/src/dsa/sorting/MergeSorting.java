package dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSorting {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 4, 1 };
		MergeSorting sol = new MergeSorting();
		mergeSort(arr, 0, arr.length - 1);
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}

	// Recursive merge sort
	public static void mergeSort(int[] arr, int low, int high) {
		if (low >= high)
			return;

		// Find mid index
		int mid = (low + high) / 2;

		// Sort left half
		mergeSort(arr, low, mid);

		// Sort right half
		mergeSort(arr, mid + 1, high);

		// Merge both halves
		merge(arr, low, mid, high);
	}

	// Function to merge two halves
	public static void merge(int[] arr, int low, int mid, int high) {
		// create temporary array
		List<Integer> temp = new ArrayList<>();
		int left = low; // left pointer
		int right = mid + 1; // right pointer

		// Merge both sorted parts
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}

		// Add remaining left elements
		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}
			

		// Add remaining right elements
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}
			

		// Copy back to original array
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}
}
