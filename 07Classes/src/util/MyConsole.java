package util;

import java.util.Scanner;

public class MyConsole {
	static Scanner sc = new Scanner(System.in);
	
	public static String promptString(String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}
	
	public static double promptDouble(String prompt) {
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
	
	public static int promptInt(String prompt) {
		boolean isValid = false;
		int result = 0;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				result = Integer.parseInt(sc.nextLine());
				isValid = true;
			}
			else {
				System.err.println("Error - invlalid entry. Try again.");
				sc.nextLine();  // discard input
			}
		}
		return result;
	}

}
