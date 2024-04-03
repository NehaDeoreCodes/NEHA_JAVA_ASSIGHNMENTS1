//find the second maximum and second minimum elements of an array

package assignments;

public class Que4 {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 7, 4, 9, 1 };

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num > max) {
				secondMax = max;
				max = num;
			} else if (num > secondMax && num != max) {
				secondMax = num;
			}

			if (num < min) {
				secondMin = min;
				min = num;
			} else if (num < secondMin && num != min) {
				secondMin = num;
			}
		}

		System.out.println("Second Maximum: " + secondMax);
		System.out.println("Second Minimum: " + secondMin);

	}

}
