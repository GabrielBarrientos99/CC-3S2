package sprint3_0.prueba;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sprint3_0.produccion.Board;
import sprint3_0.produccion.GUI;
import sprint3_0.produccion.Board.GameState;

import static org.junit.Assert.assertEquals;

public class TestCompleteGames {

    private Board board;
    @BeforeEach
    public void setUp() throws Exception {
        board = new Board();
    }

    @After
    public void tearDown() throws Exception {
    }

    // Criterio de aceptacion 4.1
    @Test
    public void testXWon() {
        board.makeMove(0, 0);
        board.makeMove(1, 1);
        board.makeMove(0, 1);
        board.makeMove(1, 0);
        board.makeMove(0, 2);
        assertEquals("", board.getGameState(), GameState.CROSS_WON);
        new GUI(board);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testXWonDiag() {
        board.makeMove(0, 0);
        board.makeMove(1, 0);
        board.makeMove(1, 1);
        board.makeMove(1, 2);
        board.makeMove(2, 2);
        assertEquals("", board.getGameState(), GameState.CROSS_WON);
        new GUI(board);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testXWonRow1() {
        board.makeMove(1, 0);
        board.makeMove(0, 1);
        board.makeMove(1, 1);
        board.makeMove(0, 0);
        board.makeMove(1, 2);
        assertEquals("", board.getGameState(), GameState.CROSS_WON);
        new GUI(board);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testXWonColumn0() {
        board.makeMove(0, 0);
        board.makeMove(2, 1);
        board.makeMove(0, 1);
        board.makeMove(1, 0);
        board.makeMove(0, 2);
        assertEquals("", board.getGameState(), GameState.CROSS_WON);
        new GUI(board);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // Criterio de aceptacion 4.3
    @Test
    public void testOWon() {
        board.makeMove(2, 2);
        board.makeMove(0, 0);
        board.makeMove(1, 1);
        board.makeMove(0, 1);
        board.makeMove(1, 0);
        board.makeMove(0, 2);
        assertEquals("", board.getGameState(), GameState.NOUGHT_WON);
        new GUI(board);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Criterio de aceptacion 4.5
    @Test
    public void testDraw() {
        board.makeMove(0, 1);
        board.makeMove(0, 0);
        board.makeMove(0, 2);
        board.makeMove(1, 2);
        board.makeMove(1, 0);
        board.makeMove(1, 1);
        board.makeMove(2, 2);
        board.makeMove(2, 0);
        board.makeMove(2, 1);
        assertEquals("", board.getGameState(), GameState.DRAW);
        new GUI(board);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}