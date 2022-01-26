import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeShould {

	@Test	void
	return_X_at_0_0_as_first_step(){
		var game = new TicTacToe();
		var result = game.nextMove(0,0);

		assertEquals(
				  		"X|_|_" +
						"_|_|_" +
				  		"_Z_Z_",
				  		result);

	}

}
