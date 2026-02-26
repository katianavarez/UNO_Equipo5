/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDateTime;

/**
 *
 * @author katia
 */
public class Turno {
    private int indiceJugador;
    private Jugador jugadorActual;
    private LocalDateTime inicioTurno;
    private boolean saltarTurno;

    public Turno() {
    }

    public Turno(int indiceJugador, Jugador jugadorActual, LocalDateTime inicioTurno, boolean saltarTurno) {
        this.indiceJugador = indiceJugador;
        this.jugadorActual = jugadorActual;
        this.inicioTurno = inicioTurno;
        this.saltarTurno = saltarTurno;
    }

    public int getIndiceJugador() {
        return indiceJugador;
    }

    public void setIndiceJugador(int indiceJugador) {
        this.indiceJugador = indiceJugador;
    }

    public Jugador getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public LocalDateTime getInicioTurno() {
        return inicioTurno;
    }

    public void setInicioTurno(LocalDateTime inicioTurno) {
        this.inicioTurno = inicioTurno;
    }

    public boolean isSaltarTurno() {
        return saltarTurno;
    }

    public void setSaltarTurno(boolean saltarTurno) {
        this.saltarTurno = saltarTurno;
    }

    @Override
    public String toString() {
        return "Turno{" + "indiceJugador=" + indiceJugador + ", jugadorActual=" + jugadorActual + ", inicioTurno=" + inicioTurno + ", saltarTurno=" + saltarTurno + '}';
    }
    
    
}
