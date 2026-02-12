package dsa.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashingUsingHashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// precompute
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int freq = 0;
			if (map.containsKey(key)) {
				freq = map.get(key);
			}
			freq++;
			map.put(key, freq);
		}

		// Iterate over the map:
//	   for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
//           System.out.println(it.getKey() + "->" + it.getValue());
//       }

		int q = 0;
		q = sc.nextInt();
		while (q-- > 0) {
			int number;
			number = sc.nextInt();
			// fetch:
			if (map.containsKey(number))
				System.out.println(map.get(number));
			else
				System.out.println(0);
		}
	}
}
