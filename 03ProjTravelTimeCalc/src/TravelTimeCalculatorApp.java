import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Travel Time Calculator\n");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			double miles = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter miles per hour: ");
			double mph = sc.nextDouble();
			sc.nextLine();
			
			// calculate estimated travel time hrs, min
			double totalHours = miles / mph;
			int hours = (int)totalHours;
			int min = (int)((totalHours-hours)*60);
			System.out.println("Estimated travel time:");
			System.out.println("----------------------");
			System.out.println("Hours:   "+hours);
			System.out.println("Minutes: "+min);
			
			System.out.print("Continue? (y/n) ");
			choice = sc.nextLine();
		}
		
		
		System.out.println("\nBye");

	}

}
