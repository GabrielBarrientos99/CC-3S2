# ACTIVIDAD TICKTACTOE
## SPRINT I

Se tiene desde el backlog product
Historia de usuario 1: Como jugador, necesito un tablero vacío de 3 x 3 para comenzar un juego TicTacToe.

Historia de usuario 2: Como jugador X, necesito colocar una ficha en un tablero tic-tac-toe para poder hacer un 
movimiento.

Historia de usuario 3: Como jugador, necesito saber si el juego termina después de cada movimiento.

### AC 1.1 Tablero vacío 

Cuando **Se inicia el juego o se reinicia la partida ,el juego estará vacio.**

Entonces **El jugador tendra que hacer el primer movimiento**

Y **A partir de ahi los jugadores se alternaran**

### AC 1.2 Referencia de fila no válida

Dado **Un tamaño de tablero**

Cuando **Se empieze a jugar, el jugador no podra pasarse de los limites del tablero**

Entonces **Se tendra en cuenta como referencia filas no validas**

### AC 1.3 Referencia de columna no válida

Dado **Un tamaño de tablero**

Cuando **Se empieze a jugar, el jugador no podra pasarse de los limites del tablero**

Entonces **Se tendra en cuenta como referencia columnas no validas**
    
    
## Características del sprint 1
### Pregunta: Explica el funcionamiento de los siguientes código dentro del sprint1.

```python
    public class TestBoardConsole {
        private Board board;

        @Before
        public void setUp() throws Exception {
         board = new Board();
        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void testEmptyBoard() {
         new Console(board).displayBoard();
        }
    }
    ////////////////////////////////////////////////////
    
    public class Console {
    private Board board;

    public Console(Board board) {
   	 this.board = board;
    }

    public void displayBoard() {
   	 for (int row = 0; row<3; row++) {
   		 System.out.println("-------");
   		 System.out.print("|"+ board.getCell(row, 0));
   		 System.out.print("|"+ board.getCell(row, 1));
   		 System.out.print("|"+ board.getCell(row, 2));
   		 System.out.println("|");
   	 }
   	 System.out.println("-------");
    }
}
```
#### Explicacion

La Clase TestBoardConsole posee un atributo privado Board board, el @Before indica que se ejecfutara antes
de la preuba unitaria ,por lo tanto primero inicializa ese atributo y le asigna un espacio en la memoria
"board = new Board" , Luego se ejecuta la funcion : public void testEmptyBoard() ,que utiliza una funcion del atributo ya inicializado **board** esta funcion se especifica en la clase Console ( muestra el tablero en la caonsola)

#### Pregunta: Realiza la cobertura de código. Explica tus respuestas.
Al realizar la cobertura del codigo nos salio como resultado porcentajes de lines covered en cada clase de prueba. Esto indica cuantas lienas de esta clase son usadas para capcturar alguna exception

## SPRINT 2


### AC 2.1 Un movimiento X válido 

Dado **Un movimiento de X**

Cuando **permancesca en los limites del tablero**

Entonces **se coloca O en la celda**

Y **el turno se cambia a X**

### AC 2.2 Un movimiento X ilegal en una celda ocupada

Dado **un juego en curso con el turno de X**

Cuando **el jugador X hace un movimiento ilegal dentro del tablero **

Entonces **no se cambia la celda Y no se cambia el turno**


### AC 2.3 Un movimiento X ilegal fuera del tablero

Dado **un juego en curso con el turno de X **

Cuando **el jugador X hace un movimiento ilegal fuera del tablero**

Entonces **la celda no se cambia**

# SPRINT 3

### AC5.1 Primer movimiento por el computador

Dado **que la computadora juega 'X'**

Cuando **el jugador humano comienza un nuevo juego**

Entonces **la computadora hace un movimiento aleatorio válido (X)** 

Y **el turno se cambia a O (jugador humano)**

### AC 5.2 Una jugada ganadora de la computadora 

Dado **Una jugada de la computadora**

Cuando **Completa una linea de X o O**

Entonces **la computadora realiza esa jugada, asegurando su victoria en el juego.**

Y  **si la computadora no encuentra una jugada ganadora en este turno, buscará la mejor jugada posible para bloquear al oponente**

### AC 5.3 Una jugada de bloqueo de la computadora

Dado **Una jugada del jugador X**

Cuando **se cumpla una secuencia de OO del jugador**

Y **Le toque el turno a la computadora**

Entonces **esta intentara evitar que gane ese punto**

### AC 5.4 Un movimiento aleatorio de la computadora

Dado un juego en curso  

Cuando el jugador humano hace un movimiento válido

Y el oponente de la computadora no tiene un movimiento ganador

Y el jugador humano no tiene el próximo movimiento ganador

Entonces la computadora hace un movimiento aleatorio 

Y se cambia de turno





