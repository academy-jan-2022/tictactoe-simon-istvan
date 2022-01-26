public class TicTacToe {

	public String nextMove(int xAxis, int yAxis) {
		String underscoreSymbol = "_";
		String playerOneSymbol = "X";

		String[][] defaultBoard = {
				{underscoreSymbol, underscoreSymbol, underscoreSymbol},
				{underscoreSymbol, underscoreSymbol, underscoreSymbol},
				{underscoreSymbol, underscoreSymbol, underscoreSymbol}
		};

			defaultBoard[yAxis][xAxis] = playerOneSymbol;


		return convertBoardToString(defaultBoard);
	}

	public String convertBoardToString(String[][] array) {

		String convertArrayToString = "";

		for (var i=0; i < array.length; i++){
			convertArrayToString += String.join("|",array[i]);
		}

		return convertArrayToString;
	}

}
