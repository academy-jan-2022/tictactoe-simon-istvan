public class TicTacToe {

	public String nextMove(int xAxis, int yAxis) {
		String underscoreSymbol = "_";
		String playerOneSymbol = "X";

		String[] firstLine = {underscoreSymbol, underscoreSymbol, underscoreSymbol};
		String[] secondLine = {underscoreSymbol, underscoreSymbol, underscoreSymbol};

		if (yAxis == 1) {
			secondLine[xAxis] = playerOneSymbol;
		} else {
			firstLine[xAxis] = playerOneSymbol;
		}

		return convertLineToString(firstLine) +
				  convertLineToString(secondLine) +
				  "_|_|_";
	}

	public String convertLineToString(String[] array) {
		return String.join("|", array);
	}


}
