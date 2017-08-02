package edu.ceis.umss.laberinto.modelo;

/**
 * @author Anonymous
 */
public class Celda {

    private Obstaculo obstaculo;
    private Jugador jugador;
    private Estado estado;
    private int fila;
    private int columna;

    public Celda(int fila, int columna) {
        estado = Estado.VACIO;
        this.fila = fila;
        this.columna = columna;
    }

    public void agregarObjeto(Object objeto) {
        if (objeto instanceof Obstaculo) {
            estado = Estado.OBSTACULO;
            obstaculo = (Obstaculo) objeto;
            obstaculo.setCelda(this);
        } else if (objeto instanceof Jugador) {
            estado = Estado.JUGADOR;
            jugador = (Jugador) objeto;
            jugador.setCelda(this);
        }
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
