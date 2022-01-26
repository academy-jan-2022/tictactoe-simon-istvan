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
	return_X_at_the_second_slot_given_1_0_as_coordinates(){
		var game = new TicTacToe();
		var result = game.nextMove(1,0);

		assertEquals(
				"_|X|_" + "_|_|_" + "_|_|_",
				result);
	}

	@Test	void
	return_X_at_the_third_slot_given_2_0_as_coordinates(){
		var game = new TicTacToe();
		var result = game.nextMove(2,0);

		assertEquals(
				"_|_|X" + "_|_|_" + "_|_|_",
				result);
	}

	@Test	void
	return_X_at_the_first_slot_second_line_given_0_1_as_coordinates(){
		var game = new TicTacToe();
		var result = game.nextMove(0,1);

		assertEquals(
				"_|_|_" + "X|_|_" + "_|_|_",
				result);
	}

}
