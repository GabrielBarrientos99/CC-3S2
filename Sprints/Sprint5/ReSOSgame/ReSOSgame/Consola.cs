using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static ReSOSgame.Tablero;

namespace ReSOSgame
{
    public class Consola
    {
        private Tablero tablero;
        private bool IsRecording;

        public Consola(Tablero tablero)
        {
            this.tablero = tablero;
            IsRecording = false;
        }

        public bool Grabado { get { return IsRecording; }  }

        public void DisplayBoard()
        {
            for (int row = 0; row < tablero.Tamanio; row++)
            {
                System.Console.WriteLine("-------");
                for (int column = 0; column < tablero.Tamanio; column++)
                {
                    System.Console.Write("|" + Symbol(tablero.GetCell(row, column)));
                }
                System.Console.WriteLine("|");
            }
            System.Console.WriteLine("-------");
        }

        public void WriteBoardToFile(string filePath)
        {
            if (IsRecording && tablero!=null)
            {
                using (StreamWriter writer = new StreamWriter(filePath, true))
                {
                    writer.WriteLine("Movimiento de la computadora:");
                    writer.WriteLine("Turno:[" + tablero.JugadorActual.Jugador + "]");
                    writer.WriteLine("Casilla: [" + tablero.JugadorActual.X + ", " + tablero.JugadorActual.Y + "]");
                    writer.WriteLine("Valor de ficha: " + Symbol(tablero.JugadorActual.Ficha));
                    for (int row = 0; row < tablero.Tamanio; row++)
                    {
                        writer.WriteLine("-------");
                        for (int column = 0; column < tablero.Tamanio; column++)
                        {
                            writer.Write("|" + Symbol(tablero.GetCell(row, column)));
                        }
                        writer.WriteLine("|");
                    }
                    writer.WriteLine("-------");
                }

            }
            
        }
        //Creamos este metodo para que el form1 de acuerdo a si esta checked o no pueda grabar
        public void Recording(bool value)
        {
            this.IsRecording = value;
        }

        private char Symbol(Cell cell)
        {
            if (cell == Cell.S)
                return 'S';
            else
            if (cell == Cell.O)
                return 'O';
            else return ' ';
        }
    }
}