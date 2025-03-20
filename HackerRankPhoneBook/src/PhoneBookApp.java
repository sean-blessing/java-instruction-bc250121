import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import util.MyConsole;

public class PhoneBookApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to the Phone Book Challenge!");
		String inputStr = "3\nuncle sam\n99912222\ntom\n11122222\nharry"+
				"\n12299933\nuncle sam\nuncle tom\nharry";
		Scanner in = new Scanner(inputStr);
		int n=in.nextInt();
		in.nextLine();
		Map<String, Integer> phoneBook = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			phoneBook.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			String msg = "";
			if (phoneBook.get(s)==null)
				msg = "Not found";
			else
				msg = s+"="+phoneBook.get(s);
			System.out.println(msg);
		}

		in.close();
		MyConsole.printLine("\nBye!");

	}

}
