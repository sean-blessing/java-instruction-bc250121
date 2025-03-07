import java.util.ArrayList;
import java.util.List;

import util.MyConsole;

public class ArrayListApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Array Lists");
		
		List<String> names = new ArrayList<>();
		names.add("Celina");
		names.add("Jim");
		names.add("Andy");
		names.add("Adrian");
		names.add("Heath");
		names.add("Joe");
		names.add("Christian");
		names.add("Nick");
		
		names.add("Test");
		
		names.forEach(n -> MyConsole.print(n + " "));
		
		MyConsole.printLine();
		
		MyConsole.printLine(names.get(4));
		
		names.add(4, "Temp");
		names.forEach(n -> MyConsole.print(n + " "));
		MyConsole.printLine();
		
		names.remove("Test");
		names.remove(4);
		names.forEach(n -> MyConsole.print(n + " "));
		MyConsole.printLine();
		

		
		
		MyConsole.printLine("\nBye");

	}

}
