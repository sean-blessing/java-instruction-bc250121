import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to table of powers!\n");
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter a number: ");
			int nbr = Integer.parseInt(sc.nextLine());
			
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			for (int i = 1; i <= nbr; i++) {
				System.out.println(i + "\t" + (i*i) + "\t" + (i*i*i));
			}
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
		}
		
		
		System.out.println("\nBye");

	}

}
