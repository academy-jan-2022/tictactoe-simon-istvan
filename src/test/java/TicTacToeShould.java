import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TicTacToeShould {

	@Test	void
	return_true_when_x_appear_on_first_move(){
		var game = new TicTacToe();
		var result = game.nextMove(0,0);

		assertTrue(result.contains("X"));
	}

	@Test	void
	return_X_at_the_second_slot_given_0_0_as_coordinates(){
		var game = new TicTacToe();
		var result = game.nextMove(1,0);

		assertEquals(
				"_|X|_" + "_|_|_" + "_|_|_",
				result);
	}




}
