package Test;

import org.junit.jupiter.api.Test;
import TicTacToe.TicTacToe;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {


    @Test
    void initialiazeBoard() {
    }

    @Test
    void play() {

    }

    @Test
    void isBoardEmpty() {
        TicTacToe game = new TicTacToe();
        game.setBoard(1,1,TicTacToe.Player.O);
        assertFalse(game.isBoardEmpty());
    }

    @Test
    void isGameWon() {
    }

    @Test
    void isDraw() {
    }

    @Test
    void isGameOver() {
    }

    @Test
    void getCurrentPlayer() {
    }

    @Test
    void getWinner() {
    }
}