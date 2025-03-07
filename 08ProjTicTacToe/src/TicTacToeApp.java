import util.MyConsole;

public class TicTacToeApp {

	static String boardBoarder = "+---+---+---+";
	
	static String[][] board = {{" ", " ", " "},
			{" ", " ", " "},
			{" ", " ", " "}};
	
	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to Tic Tac Toe!", "+");
		
		boolean winner = false;
		while (!winner) {
			// alternate between x and o
			displayBoard();
			// get user entry (position on board)
			// place x/o on board
			
			
			// simulation
			// x - position 1,1
			board[1][1] = "X";
			displayBoard();
			
			// o - 0,2
			board[0][2] = "O";
			displayBoard();
			
			// x - 0,0
			board[0][0] = "X";
			displayBoard();
			
			// o - 1,2
			board[1][2] = "O";
			displayBoard();

			break;
		}

		
		MyConsole.printLine("\nBye");
	}
	
	private static void displayBoard() {
		String boardString = boardBoarder + "\n";
		// loop through the rows
		for (int r = 0; r < board.length; r++) {
			// loop through the columns
			boardString += "|";
			for (int c = 0; c < board[r].length; c ++) {
				boardString += " " + (board[r][c]) + " |";
			}
			boardString += "\n" + boardBoarder + "\n";
		}
		MyConsole.printLine(boardString);
	}
}
