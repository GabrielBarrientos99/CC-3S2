﻿using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static ReSOSgame.Tablero;

namespace ReSOSgame
{
    public abstract class Juego
    {
        public Tablero tablero;
        public ScoreValidator validator;
        public int Tamanio { get { return tablero.Tamanio; } }
        public Juego(Tablero tablero)
        {
            this.tablero = tablero;
            validator = new ScoreValidator(tablero);
        }
        public abstract void FinalGameState(); // Funcion que indica el estado final del juego
        public abstract void MakeMove(int row,int col ,Cell ficha); // Funcion para realizar un movimiento
    }
    public class JuegoSimple : Juego
    {
        public JuegoSimple(Tablero tablero) : base(tablero)
        {
        }
        // Funcion que calcula el estado final Si ha sido un empate o ha ganado alguno de los players.
        public override void FinalGameState() 
        {
            if (validator.FullBoard())
            {
                tablero.EstadoDeJuego = Tablero.GameState.EMPATE;
            }
            else
            {
                tablero.EstadoDeJuego = tablero.Turno == Tablero.Jugador.JAZUL ?
                    Tablero.GameState.GANOAZUL : Tablero.GameState.GANOROJO;  // Cambia el estado del tablero
            }
        }
        // Funcion que realiza un movimiento como Juego simple.
        public override void MakeMove(int row, int column, Cell _ficha)
        {
            if(!validator.GameOver()) // Si es el estado de juego es JUGANDO
            {
                if ( isOnBoard(row,column) && isEmpty(row,column)) // Si la posicion :[row,column] esta en el trablero y esa posicion esta vacia
                {
                    tablero.ValidMove = true; // El atributo ValidMove es verdadero. 
                    tablero.Ficha = _ficha; // rellena el atributo Ficha
                    tablero.Grid[row, column] = _ficha; // rellena el grid del tablero con ficha
                    if (validator.HasOnePoint(row,column,tablero.Ficha) || validator.FullBoard()) // Cuando se ha hecho ganado 1 punto o esta el tablero lleno
                    {
                        FinalGameState(); // Actualiza el estado final del tablero
                    }
                    if (tablero.EstadoDeJuego == GameState.JUGANDO)  // Si el estado de juego es JUGANDO entonces ...
                    {
                        tablero.Turno = (tablero.Turno == Jugador.JAZUL) ? Jugador.JROJO : Jugador.JAZUL; // Se hace el cambio de turno
                    }
                    

                }
                else
                {
                    tablero.ValidMove = false;
                }
            }
            else
            {
                tablero.ValidMove = false;
            }
        }

        // Funcion que verifica Si la casilla pasada esta detro del tablero
        private bool isOnBoard(int row, int column)
        {
            return row >= 0 && row < tablero.Tamanio && column >= 0 && column < tablero.Tamanio;
        }
        // Funcion que verifica Si la casilla pasada esta vacia
        private bool isEmpty(int row, int column)
        {
            return tablero.GetCell(row, column) == 0;
        }

    }



    public class JuegoGeneral : Juego
    {
        // Atributos para tener los puntajes de cada jugador.
        private int puntajeAzul = 0;
        private int puntajeRojo = 0;
        public JuegoGeneral(Tablero tablero) : base(tablero)
        {
        }
        public int PuntajeAzul { get { return puntajeAzul; } }
        public int PuntajeRojo { get { return puntajeRojo; } }

        // Funcion que calcula el estado final comparando los puntajes.
        public override void FinalGameState() 
        {

            if (puntajeAzul > puntajeRojo)
            {
                tablero.EstadoDeJuego = Tablero.GameState.GANOAZUL; // Establece que el azul ha ganado
            }
            else if (puntajeAzul < puntajeRojo)
            {
                tablero.EstadoDeJuego = Tablero.GameState.GANOROJO; // Establece que el rojo ha ganado
            }
            else if (puntajeRojo==puntajeAzul)
            {
                tablero.EstadoDeJuego = Tablero.GameState.EMPATE; // Establece que ha habido un empate
            }
            //sino, el estado de juego es JUGANDO
        }
        // Funcion que realiza un movimiento como Juego general.
        public override void MakeMove(int row, int column, Cell _ficha)
        {
            if(!validator.GameOver())
            {
                if (row >= 0 && row < tablero.Tamanio && column >= 0 && column < tablero.Tamanio
                       && tablero.Grid[row, column] == 0)
                {
                    tablero.ValidMove = true;
                    tablero.Ficha = _ficha;
                    tablero.Grid[row, column] = _ficha;
                    if (validator.HasOnePoint(row, column, tablero.Ficha)) // Si se ha obtenido un punto
                    {
                        //en el turno del jugador JAZUL
                        if (tablero.Turno == Jugador.JAZUL)
                        {
                            puntajeAzul++; // Se agrega un punto al jugador Azul
                        } //en el turno del jugador JROJO
                        else                        {
                            puntajeRojo++; // Se agrega un punto al jugador Rojo
                        }
                    }
                    if (validator.FullBoard())
                    {
                        FinalGameState(); // Actualiza el estado del juego cuando el tablero esta lleno
                    }
                    // Nota: esa funcion detiene el cambio de turno cuando ya se halla ganado o empatado
                    if (tablero.EstadoDeJuego == GameState.JUGANDO) // Si se sigue jugando
                    {
                        tablero.Turno = (tablero.Turno == Jugador.JAZUL) ? Jugador.JROJO : Jugador.JAZUL; // Se cambia de turno al jugador contrario
                    }
                    
                }
            }
            else
            {
                tablero.ValidMove = false;
            }
        }
    }
}