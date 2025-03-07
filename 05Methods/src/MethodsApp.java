import java.util.Scanner;

public class MethodsApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to methods!\n");

		// add 2 numbers
		int x = promptInt("Enter number x: ");
		int y = promptInt("Enter number y: ");

		int sum = x + y;
		System.out.println("sum = " + sum);

		// divide two doubles
		// get two doubles, divide 'em, and print the result
		// create a method promptDouble
		double d1 = promptDouble("Enter first double: ");
		double d2 = promptDouble("Enter second double: ");

		double result = d1 / d2;
		System.out.println("result = " + result);

		sc.close();
		System.out.println("\nBye");
	}

	// use data validation
	private static double promptDouble(String prompt) {
		boolean isValid = false;
		double result = 0.0;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				result = Double.parseDouble(sc.nextLine());
				isValid = true;
			}
			else {
				System.err.println("Error - invlalid entry. Try again.");
				sc.nextLine();  // discard input
			}
		}
		return result;
	}

	// use exception handling
	private static int promptInt(String prompt) {
		boolean isValid = false;
		int result = 0;
		while (!isValid) {
			try {
				System.out.print(prompt);
				result = Integer.parseInt(sc.nextLine());
				isValid = true;
			} catch (Exception e) {
				System.err.println("Error - invlalid entry. Try again.");
			}
		}
		return result;
	}

}
