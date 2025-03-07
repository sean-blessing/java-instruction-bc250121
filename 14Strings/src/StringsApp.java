import util.MyConsole;

public class StringsApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Strings!");
		
		// p. 469 index, length, charAt
		String fullName = "Joseph Allen Hawes";
		// first, middle, last name?
		int firstSpaceIdx = fullName.indexOf(' ');
		MyConsole.printLine("firstspace = "+firstSpaceIdx);
		int secondSpaceIdx = fullName.indexOf(' ', (firstSpaceIdx+1));
		MyConsole.printLine("secondSpaceIdx = "+secondSpaceIdx);
		
		// p. 471
		String firstName = fullName.substring(0,firstSpaceIdx);
		MyConsole.printLine(firstName);
		String middleName = fullName.substring(firstSpaceIdx+1, secondSpaceIdx);
		MyConsole.printLine(middleName);
		String lastName = fullName.substring(secondSpaceIdx+1);
		
		MyConsole.printLine(lastName);
		
		// hangman hint - hiddenword
		String theWord = "happyhour";
		String hiddenWord = "_".repeat(theWord.length());
		MyConsole.printLine("The word = "+theWord+".");
		MyConsole.printLine("hidden word = "+hiddenWord+".");
		
		MyConsole.printHeader("Resolve letters!");
		// loop until all letters guessed
		while (hiddenWord.indexOf('_') >= 0) {
			displayHiddenWord(hiddenWord);
			// guess a letter
			String guess = MyConsole.promptString("Letter guess: ");
			// resolve letter in hiddenWord OR display message incorrectGuess
			char[] chars = theWord.toCharArray();
			char[] hiddenChars = hiddenWord.toCharArray();
			if (theWord.indexOf(guess.charAt(0))== -1) {
				MyConsole.printLine("Incorrect guess");
			}
			else {
				for (int i = 0; i < chars.length; i++) {
					if (guess.charAt(0) == chars[i]) {
						hiddenChars[i] = guess.charAt(0);
					}
				}
				hiddenWord = String.valueOf(hiddenChars);
			}
		}
		
		MyConsole.printLine("\nBye");

	}

	private static void displayHiddenWord(String hiddenWord) {
		// display hiddenWord with spaces
		String hiddenWordDisplay = "";
		char[] chars = hiddenWord.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			hiddenWordDisplay += chars[i]+ " ";
		}
		MyConsole.printLine("hidden word display = "+hiddenWordDisplay+".");
	}

}
