<<<<<<< HEAD
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRequisito2 {

    Board tablero;
    @BeforeEach
    public void IniciarTablero(){
        tablero = new Board();
    }
    @Test
    public void WhenXPlayFirstThenReturnsX(){
        assertEquals('X',tablero.proximoJugador(false));
    }
    @Test
    public void WhenLastTurnWasXThenReturnsO(){
        tablero.setUltimojugador('X');
        assertEquals('O',tablero.proximoJugador(true));
    }
    @Test
    public void WhenLastTurnWasOThenReturnsX(){
        tablero.setUltimojugador('O');
        assertEquals('X',tablero.proximoJugador(true));
    }


}
=======
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRequisito2 {

    Board tablero;
    @BeforeEach
    public void IniciarTablero(){
        tablero = new Board();
    }
    @Test
    public void WhenXPlayFirstThenReturnsX(){
        assertEquals('X',tablero.proximoJugador(false));
    }
    @Test
    public void WhenLastTurnWasXThenReturnsO(){
        tablero.setUltimojugador('X');
        assertEquals('O',tablero.proximoJugador(true));
    }
    @Test
    public void WhenLastTurnWasOThenReturnsX(){
        tablero.setUltimojugador('O');
        assertEquals('X',tablero.proximoJugador(true));
    }


}
>>>>>>> 206677e56b0ff2e05e4c044f87be8ec6b7c79d1a
