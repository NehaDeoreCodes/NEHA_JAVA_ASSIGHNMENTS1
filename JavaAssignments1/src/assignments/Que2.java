package assignments;

public class Que2 {

	public static void main(String[] args) {
		int[] arr = { 10, 25, 30, 15, 40 }; // Sample array

		// Find maximum element
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum Element: " + max);

		// Calculate average
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		double average = (double) sum / arr.length;
		System.out.println("Average of Elements: " + average);

	}

}
