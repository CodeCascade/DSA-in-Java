package dsa.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 4, 1 };
		quickSort(arr, 0, arr.length - 1);
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}
	
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int partitionIndex = findpartitionIndex(arr, low, high);
			quickSort(arr, low, partitionIndex-1);
			quickSort(arr, partitionIndex+1, high);
		}
	}
	
	public static Integer findpartitionIndex(int[] arr, int low, int high) {
	    int pivot = arr[low];
	    int i=low;
	    int j=high;
	    
	    while(i<j) {
	    	 while(arr[i] <= pivot && i <= high-1) {
	 	    	i++;
	 	    }
	 	    while(arr[j] > pivot && j>=low+1) {
	 	    	j--;
	 	    }
	 	    if(i < j) {
	 	    	int temp = arr[j];
	 	    	arr[j] = arr[i];
	 	    	arr[i] = temp;
	 	    }
	    }
	   
	    int temp = arr[low];
	    arr[low] = arr[j];
	    arr[j] = temp;
	    
	    return j;
	}
}
