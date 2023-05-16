public class Board {
    private final int tamanio = 3;
    private Piece[][] board;
    private char[][] estadoCasilla; // '\0' 'X'
    private char Ultimojugador='X';
    public enum Resultado{GANA_O,GANA_X, NO_GANADOR,EMPATE}
    public Resultado currentGameState;
    public Board(){
        this.board = new Piece[tamanio][tamanio];
        this.estadoCasilla= new char[tamanio][tamanio];
        rellenarCasillasAVacias();
    }


    private void rellenarCasillasAVacias(){
        for(int i = 0;i < tamanio;i++)
        {
            for(int j= 0;j < tamanio;j++)
            {
                estadoCasilla[i][j]='\0';
            }
        }
    }
    public char[][] getEstadoCasilla() {
        return estadoCasilla;
    }

    public void setUltimojugador(char a) {
        this.Ultimojugador=a;
    }

    public void jugar(int x, int y) {

        if( CoordenadasXnoValida(x,y) )
        {
            throw new RuntimeException("Coordenada X fuera de rango");
        }
        if( CoordenadasYnoValida(x,y))
        {
            throw new RuntimeException("Coordenada Y fuera de rango");
        }
        if(CasillaOcupada(x,y)){
            throw new RuntimeException("Coordenada Ocupada");
        }
        estadoCasilla[x][y]=Ultimojugador;
        currentGameState = EstablecerGanador();
        if(currentGameState==Resultado.NO_GANADOR)
        {
            Ultimojugador = proximoJugador(true);
        }

    }
    private boolean HayGanadorEnFilas() {
        for (int i = 0; i < tamanio; i++) {
            if (estadoCasilla[i][0] == Ultimojugador
                    && estadoCasilla[i][1] == Ultimojugador
                    && estadoCasilla[i][2] == Ultimojugador) {
                return true;
            }
        }
        return false;
    }
    private boolean HayGanadorEnColumnas() {
        for (int i = 0; i < tamanio; i++) {
            if (estadoCasilla[0][i] == Ultimojugador
                    && estadoCasilla[1][i] == Ultimojugador
                    && estadoCasilla[2][i] == Ultimojugador) {
                return true;
            }
        }
        return false;
    }
    private boolean HayGanadorEnDiagonal1() {
        return estadoCasilla[0][0] == Ultimojugador
                && estadoCasilla[1][1] == Ultimojugador
                && estadoCasilla[2][2] == Ultimojugador;
    }
    private boolean HayGanadorEnDiagonal2() {
        return estadoCasilla[0][2] == Ultimojugador
                && estadoCasilla[1][1] == Ultimojugador
                && estadoCasilla[2][0] == Ultimojugador;
    }
    private boolean EsEmpate() {
        int casillasOcupadas = 0;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (estadoCasilla[i][j] != '\0') {
                    casillasOcupadas++;
                }
            }
        }
        return casillasOcupadas == tamanio * tamanio;
    }
    public Resultado EstablecerGanador() {
        if (HayGanadorEnFilas()) {
            return (Ultimojugador == 'X') ? Resultado.GANA_X : Resultado.GANA_O;
        }

        if (HayGanadorEnColumnas()) {
            return (Ultimojugador == 'X') ? Resultado.GANA_X : Resultado.GANA_O;
        }

        if (HayGanadorEnDiagonal1() || HayGanadorEnDiagonal2()) {
            return (Ultimojugador == 'X') ? Resultado.GANA_X : Resultado.GANA_O;
        }

        if (EsEmpate()) {
            return Resultado.EMPATE;
        }
        return Resultado.NO_GANADOR;
    }
    private boolean CoordenadasXnoValida(int x,int y){
            return x < 0 ||  x > tamanio-1;
    }

    private boolean CoordenadasYnoValida(int x,int y){
            return y < 0 ||  y > tamanio-1;
    }
    private boolean CasillaOcupada(int x,int y){
            return estadoCasilla[x][y]!='\0';
    }


    public char proximoJugador(boolean AcaboLaJugada) {
        if(!AcaboLaJugada) return Ultimojugador;

        if (Ultimojugador == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }


}
