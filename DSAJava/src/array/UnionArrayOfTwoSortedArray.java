package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionArrayOfTwoSortedArray {
	public static List<Integer> findUnion(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < n && j < m) {

            // Skip duplicates in arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            // Skip duplicates in arr2
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                result.add(arr1[i++]);
            } 
            else if (arr1[i] > arr2[j]) {
                result.add(arr2[j++]);
            } 
            else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < n) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                result.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2
        while (j < m) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                result.add(arr2[j]);
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};

        System.out.println(findUnion(arr1, arr2));
    }
}
