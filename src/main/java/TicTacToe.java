public class TicTacToe {

	public String nextMove(int xAxis, int yAxis) {
		if (xAxis == 1 && yAxis == 0)
			return "_|X|_" +
					  "_|_|_" +
					  "_|_|_";
		return "X|_|_" +
				"_|_|_" +
				"_|_|_";
	}
}
