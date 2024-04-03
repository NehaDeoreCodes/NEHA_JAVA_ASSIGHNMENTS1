//count the number of occurrence of each element of an array
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Que5 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 1, 5, 2 };
		Map<Integer, Integer> countMap = new HashMap<>();

		for (int num : arr) {
			if (countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num) + 1);
			} else {
				countMap.put(num, 1);
			}
		}

		System.out.println("Number of occurrences of each element:");
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());

		}

	}
}
