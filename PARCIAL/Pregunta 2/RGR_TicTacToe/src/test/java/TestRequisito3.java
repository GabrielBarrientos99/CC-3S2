import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRequisito3 {
    Board tablero;
    @BeforeEach
    public void IniciarTablero(){
        tablero = new Board();
    }
    @Test
    public void testHayGanadorDefault() {
        tablero.jugar(0,0);
        assertEquals(Board.Resultado.NO_GANADOR,tablero.currentGameState);
    }

    @Test
    public void WhenAllHorizontalLineisOcuppiedThenPlayerWin() {
        tablero.jugar(0,0); // juega X
        tablero.jugar(1,0); // juega Y
        tablero.jugar(0,1); // juega X
        tablero.jugar(1,1); // juega Y
        tablero.jugar(0,2); // juega X
        assertEquals(Board.Resultado.GANA_X,tablero.currentGameState);
    }

    @Test
    public void WhenAllVerticalLineisOcuppiedThenPlayerWin() {
        tablero.jugar(0,0); // juega X
        tablero.jugar(1,1); // juega Y
        tablero.jugar(1,0); // juega X
        tablero.jugar(0,1); // juega Y
        tablero.jugar(2,0); // juega X
        assertEquals(Board.Resultado.GANA_X,tablero.currentGameState);
    }

    @Test
    public void WhenAllDiagonalLine1isOcuppiedThenPlayerWin() {
        tablero.jugar(0,0); // juega X
        tablero.jugar(0,1); // juega Y
        tablero.jugar(1,1); // juega X
        tablero.jugar(0,2); // juega Y
        tablero.jugar(2,2); // juega X
        assertEquals(Board.Resultado.GANA_X,tablero.currentGameState);
    }

    @Test
    public void WhenAllDiagonalLine2isOcuppiedThenPlayerWin() {
        tablero.jugar(0,2); // juega X
        tablero.jugar(0,1); // juega Y
        tablero.jugar(1,1); // juega X
        tablero.jugar(0,0); // juega Y
        tablero.jugar(2,0); // juega X
        assertEquals(Board.Resultado.GANA_X,tablero.currentGameState);
    }


}
