public class TicTacToe {

	public String nextMove(int xAxis, int yAxis) {
		String underscoreSymbol= "_";
		String playerOneSymbol= "X";


		if (xAxis == 2 && yAxis == 0) {
			String[] firstLine = {underscoreSymbol, underscoreSymbol, playerOneSymbol};
			String convertedArray = firstLine[0] + "|" + firstLine[1] + "|" + firstLine[2];
			return convertedArray +
					"_|_|_" +
					"_|_|_";
		}

		return "_|X|_" +
				"_|_|_" +
				"_|_|_";
	}
}
