package assignments;

import java.util.Scanner;

public class Que3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		scanner.close();

		System.out.println("Original Array:");
		printArray(arr);

		reverse(arr);

		System.out.println("\nReversed Array:");
		printArray(arr);
	}

	public static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

	}

}
