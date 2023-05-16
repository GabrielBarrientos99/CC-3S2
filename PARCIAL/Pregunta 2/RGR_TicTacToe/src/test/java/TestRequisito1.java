import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestRequisito1 {
    @Test
    public void WhenPieceIsOffAxisXThenReturnException()
    {
        Board tablero = new Board();
        assertThrows(RuntimeException.class,()->tablero.jugar(-1,2));
    }

    @Test
    public void WhenPieceIsOffAxisYThenReturnException()
    {
        Board tablero = new Board();
        assertThrows(RuntimeException.class,()->tablero.jugar(0,3));
    }

    @Test
    public void WhenPieceIsOnOcuppiedSpaceThenReturnsException()
    {
        Board tablero = new Board();
        char[][] casillas =tablero.getEstadoCasilla();
        casillas[0][1]='X';
        assertThrows(RuntimeException.class,()->tablero.jugar(0,1));
    }
}
