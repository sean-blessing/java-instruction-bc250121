import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Fizz Buzz\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter number: ");
			int n = Integer.parseInt(sc.nextLine());
			for (int i = 1; i <= n; i++) {
				if (i % 15 == 0)
					System.out.println("fizzbuzz");
				else if (i % 3 == 0)
					System.out.println("fizz");
				else if (i % 5 == 0)
					System.out.println("buzz");
				else
					System.out.println(i);
			}
			
			
			
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
		}
		
		sc.close();
		System.out.println("\nBye");

	}

}
