import util.MyConsole;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int nbr = MyConsole.promptInt("Enter a number: ");
		System.out.println("number = "+nbr);
	}

}
