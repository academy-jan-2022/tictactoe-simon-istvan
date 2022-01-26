public class TicTacToe {

	public String nextMove(int xAxis, int yAxis) {
		String underscoreSymbol= "_";
		String playerOneSymbol= "X";

		String[] firstLine = {underscoreSymbol, underscoreSymbol, underscoreSymbol};
		firstLine[xAxis]= playerOneSymbol;
		String convertedArray = firstLine[0] + "|" + firstLine[1] + "|" + firstLine[2];
		return convertedArray +
				"_|_|_" +
				"_|_|_";

	}
}
