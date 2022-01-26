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


		String convertedArray = firstLine[0] + "|" + firstLine[1] + "|" + firstLine[2];
		String secondLineConvertedArray = secondLine[0] + "|" + secondLine[1] + "|" + secondLine[2];

				  //String.join("|", secondLine);
		return convertedArray +
				  secondLineConvertedArray +
				  "_|_|_";

	}


}
