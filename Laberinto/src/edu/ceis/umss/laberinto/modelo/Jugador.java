package edu.ceis.umss.laberinto.modelo;

/**
 * @author Anonymous
 */
public class Jugador {

    private int id;
    private String nickname;
    private Celda celda;
    private Tablero tablero;

    public Jugador(int id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public void mover(Direccion direcion) {
        switch (direcion) {
            case ABAJO:
                if(validarCelda(celda.getFila()+1, celda.getColumna())) {
                    tablero.limpiarCelda(celda);
                    tablero.getCelda(celda.getFila()+1, celda.getColumna()).agregarObjeto(this);
                }
                break;
            case ARRIBA:
                if(validarCelda(celda.getFila()-1, celda.getColumna())) {
                    tablero.limpiarCelda(celda);
                    tablero.getCelda(celda.getFila()-1, celda.getColumna()).agregarObjeto(this);
                }
                break;
            case DERECHA:
                if(validarCelda(celda.getFila(), celda.getColumna() +1)) {
                    tablero.limpiarCelda(celda);
                    tablero.getCelda(celda.getFila(), celda.getColumna()+1).agregarObjeto(this);
                }
                break;
            case IZQUIERDA:
                if(validarCelda(celda.getFila(), celda.getColumna() -1)) {
                    tablero.limpiarCelda(celda);
                    tablero.getCelda(celda.getFila(), celda.getColumna()-1).agregarObjeto(this);
                }
                break;
        }
    }

    public void setCelda(Celda celda) {
        this.celda = celda;
    }

    private boolean validarCelda(int fila, int columna) {
        if (fila < tablero.getCeldas().length
                && columna < tablero.getCeldas().length
                && columna >= 0 && fila >= 0) {
            if (tablero.getCelda(fila, columna).getEstado() == Estado.VACIO) {
                return true;
            }
        }
        return false;
    }
}
