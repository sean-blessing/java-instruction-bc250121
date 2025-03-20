import util.MyConsole;

public class PalindromeApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to the Palindrome App!");

		int x = 121;
		MyConsole.printLine("x is "+x+". isPalindrome: "+isPalindrome(x));
		
		x = -121;
		MyConsole.printLine("x is "+x+". isPalindrome: "+isPalindrome(x));
		
		x = 10;
		MyConsole.printLine("x is "+x+". isPalindrome: "+isPalindrome(x));
		
		
		MyConsole.printLine("\nBye");
	}
	
    public static boolean isPalindrome(int x) {
    	String xStr = String.valueOf(x);
    	String xRev = new StringBuilder(xStr).reverse().toString();
        return xStr.equals(xRev);
    }

}
