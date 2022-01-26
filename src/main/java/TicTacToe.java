public class TicTacToe {

	public String nextMove(int xAxis, int yAxis) {
		String underscoreSymbol = "_";
		String playerOneSymbol = "X";

		String[] firstLine = {underscoreSymbol, underscoreSymbol, underscoreSymbol};
		String[] secondLine = {underscoreSymbol, underscoreSymbol, underscoreSymbol};
		String[] thirdLine = {underscoreSymbol, underscoreSymbol, underscoreSymbol};

		if (yAxis == 2) {
			thirdLine[xAxis] = playerOneSymbol;
		}else if (yAxis == 1) {
			secondLine[xAxis] = playerOneSymbol;
		} else {
			firstLine[xAxis] = playerOneSymbol;
		}

		return convertLineToString(firstLine) +
				  convertLineToString(secondLine) +
				convertLineToString(thirdLine);
	}

	public String convertLineToString(String[] array) {
		return String.join("|", array);
	}


}
