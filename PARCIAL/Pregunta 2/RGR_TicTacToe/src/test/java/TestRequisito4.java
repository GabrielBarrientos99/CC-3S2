import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRequisito4 {
    Board tablero;
    @BeforeEach
    public void IniciarTablero(){
        tablero = new Board();
    }
    @Test
    public void WhenIsFullBoardThenReturnTie(){
        tablero.jugar(0,0); // juega X
        tablero.jugar(1,0); // juega O
        tablero.jugar(2,0); // juega X
        tablero.jugar(0,1); // juega O
        tablero.jugar(2,1); // juega X
        tablero.jugar(1,1); // juega O
        tablero.jugar(1,2); // juega X
        tablero.jugar(2,2); // juega O
        tablero.jugar(0,2); // juega X
        assertEquals(Board.Resultado.EMPATE,tablero.currentGameState);
    }
}
