public class Board {
    private final int tamanio = 3;
    private Piece[][] board;
    private char[][] estadoCasilla;
    private char Ultimojugador='X';
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
    }

    private boolean CoordenadasXnoValida(int x,int y){
            return x < 0 ||  x >= tamanio-1;
    }

    private boolean CoordenadasYnoValida(int x,int y){
            return y < 0 ||  y >= tamanio-1;
    }
    private boolean CasillaOcupada(int x,int y){
            return estadoCasilla[x][y]=='X';
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
