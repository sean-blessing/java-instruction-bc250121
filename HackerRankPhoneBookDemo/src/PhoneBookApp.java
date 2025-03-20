import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookApp {
	
	public static void main(String []argh)
	{
		String inputStr = "3\n"
				+ "uncle sam\n"
				+ "99912222\n"
				+ "tom\n"
				+ "11122222\n"
				+ "harry\n"
				+ "12299933\n"
				+ "uncle sam\n"
				+ "uncle tom\n"
				+ "harry\n"
				+ "uncle harry\n"
				+ "andy\n"
				+ "tom\n"
				+ "nick";
		Scanner in = new Scanner(inputStr);
		int n=in.nextInt();
		in.nextLine();
		Map<String, Integer> phoneBook = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			// add to the phoneBook
			phoneBook.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			String display = "Not found";
			if (phoneBook.containsKey(s)) {
				display = s+"="+phoneBook.get(s);
			}
			System.out.println(display);
		}
		in.close();
	}
}
