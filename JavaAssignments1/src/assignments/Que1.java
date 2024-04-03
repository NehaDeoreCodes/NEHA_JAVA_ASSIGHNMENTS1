package assignments;

public class Que1 {
	public static void main(String args[]) {
		int N = 5;
		int height = 3;
		int width = 5;
		int N1 = 6;
		int r = 6;
		int r1 = 6;
		int rows = 5;

		{
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		System.out.println("\nPattern B:");

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("\nPattern C:");
		for (int i = 0; i < N1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			for (int k = i; k < N1 - 1; k++) {
				System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println("\nPattern D:");
		for (int i = N; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println("\nPattern E:");
		for (int i = 1; i <= r; i++) {
			for (int j = r - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\nPattern F:");
		for (int i = r1; i >= 1; i--) {

			for (int j = r1 - i; j >= 1; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("\nPattern G :");
		for (int i = 1; i <= r; i++) {

			for (int j = 1; j <= r - i; j++) {
				System.out.print(" ");
			}

			if (i == r) {
				for (int k = 1; k <= 2 * i - 1; k++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
					System.out.print(" ");
				}
				if (i > 1) {
					System.out.print("*");
				}
			}

			System.out.println();
		}

		System.out.println("\nPattern H :");
		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= (rows - i) * 5; j++) {
				System.out.print(" ");
			}

			for (int j = i; j <= i * 2 - 1; j++) {
				System.out.print(j + "   ");
			}

			for (int j = i * 2 - 2; j >= i; j--) {
				System.out.print(j + "    ");
			}

			System.out.println();
		}

	}
}
