package practice;

import java.util.Scanner;

public class Conditionalstatement {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		scanner.close();
		String x = "";
		if (n % 2 == 0) {
			if (n >= 2 && n <= 5) {
				x = "Not Weird";
			}

			if (n >= 6 && n <= 20) {
				x = "Weird";
			}

			if (n > 20) {
				x = "Not Weird";
			}
		} else {
			x = "Weird";
			// Complete the code
		}
		System.out.println(x);
	}
}
