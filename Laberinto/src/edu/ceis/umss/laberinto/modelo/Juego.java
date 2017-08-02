package edu.ceis.umss.laberinto.modelo;

/**
 * @author Anonymous
 */
public class Juego {
    private Tablero tablero;
    private Jugador jugador;

    public Juego(Jugador jugador) {
        this.jugador = jugador;
        tablero = new Tablero(6);
        generarTablero(tablero);
        jugador.setTablero(tablero);
    }
    private void generarTablero(Tablero tablero) {
        tablero.getCelda(0, 0).agregarObjeto(jugador);
        tablero.getCelda(0, 3).agregarObjeto(new Obstaculo());

        ///// FILA 1
        tablero.getCelda(1, 0).agregarObjeto(new Obstaculo());
        tablero.getCelda(1, 1).agregarObjeto(new Obstaculo());
        tablero.getCelda(1, 5).agregarObjeto(new Obstaculo());

        ///// FILA 2
        tablero.getCelda(2, 3).agregarObjeto(new Obstaculo());
        tablero.getCelda(2, 5).agregarObjeto(new Obstaculo());

        ///// FILA 3
        tablero.getCelda(3, 0).agregarObjeto(new Obstaculo());
        tablero.getCelda(3, 1).agregarObjeto(new Obstaculo());
        tablero.getCelda(3, 2).agregarObjeto(new Obstaculo());
        tablero.getCelda(3, 3).agregarObjeto(new Obstaculo());
        tablero.getCelda(3, 5).agregarObjeto(new Obstaculo());

        ///// FILA 4
        tablero.getCelda(4, 5).agregarObjeto(new Obstaculo());

        ///// FILA 5
        tablero.getCelda(5, 1).agregarObjeto(new Obstaculo());
        tablero.getCelda(5, 3).agregarObjeto(new Obstaculo());
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
}
