package edu.ceis.umss.laberinto.controlador;

import edu.ceis.umss.laberinto.modelo.Direccion;
import edu.ceis.umss.laberinto.modelo.Juego;
import edu.ceis.umss.laberinto.modelo.Jugador;

import java.util.Scanner;

/**
 * @author Anonymous
 */
public class Main {

    public static void main(String[] args) {
        Jugador jugador = new Jugador(12, "Anonymous");
        Juego juego = new Juego(jugador);

        juego.getTablero().mostrarTablero();
        Scanner lector = new Scanner(System.in);
        while (true) {
            String direccion = lector.nextLine();
            if (direccion.equals("q")) {
                break;
            }
            switch (direccion) {
                case "w":
                    jugador.mover(Direccion.ARRIBA);
                    break;
                case "s":
                    jugador.mover(Direccion.ABAJO);
                    break;
                case "a":
                    jugador.mover(Direccion.IZQUIERDA);
                    break;
                case "d":
                    jugador.mover(Direccion.DERECHA);
                    break;
            }
            juego.getTablero().mostrarTablero();
        }
    }
}
