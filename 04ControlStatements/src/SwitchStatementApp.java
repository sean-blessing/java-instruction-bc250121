import java.util.Scanner;

public class SwitchStatementApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Switch Statements!\n");
		Scanner sc = new Scanner(System.in);

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			System.out.println("MENU:");
			System.out.println("-----------");
			System.out.println("get");
			System.out.println("add");
			System.out.println("del");
			System.out.println("exit");

			System.out.print("Command: ");
			command = sc.nextLine();

			switch (command) {
			case "get":
				System.out.println("get selected");
				break;
			case "add":
				System.out.println("add selected");
				break;
			case "del":
				System.out.println("del selected");
				break;
			case "exit":
				System.out.println("exit selected");
				break;
			default:
				System.out.println("Invalid command.");
				break;
			}
		}

		System.out.println("\nBye");

	}

}
