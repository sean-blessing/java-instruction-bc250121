import java.util.Scanner;

public class GreatestCommonDivisorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Greatest Common Divisor\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			// prompt two #s, x & y
			System.out.print("Enter x: ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.print("Enter y: ");
			int y = Integer.parseInt(sc.nextLine());
			
			// compute greatest common divisor
			while (x != 0) {
				while (y >= x) {
					y -= x;
				}
				int hold = y;
				y = x;
				x = hold;
			}
			// print GCD x= 0, y = GCD
			System.out.println("\nGreatest Common Divisor: "+y);
			
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
		}
		
		sc.close();
		System.out.println("\nBye");

	}

}
