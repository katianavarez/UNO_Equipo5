/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.Color;
import enums.Direccion;
import enums.EstadoPartida;
import enums.EstadoSala;
import java.util.List;

/**
 *
 * @author katia
 */
public class Partida {
    private EstadoPartida estado;
    private Direccion direccion;
    private MazoRobo mazoRobo;
    private MazoDescarte mazoDescarte;
    private Turno turnoActual;
    private Color colorActivo;
    private List<Jugador> jugadores;
    private EstadoSala estadoSala;

    public Partida() {
    }

    public Partida(EstadoPartida estado, Direccion direccion, MazoRobo mazoRobo, MazoDescarte mazoDescarte, Turno turnoActual, Color colorActivo, List<Jugador> jugadores, EstadoSala estadoSala) {
        this.estado = estado;
        this.direccion = direccion;
        this.mazoRobo = mazoRobo;
        this.mazoDescarte = mazoDescarte;
        this.turnoActual = turnoActual;
        this.colorActivo = colorActivo;
        this.jugadores = jugadores;
        this.estadoSala = estadoSala;
    }

    public EstadoPartida getEstado() {
        return estado;
    }

    public void setEstado(EstadoPartida estado) {
        this.estado = estado;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public MazoRobo getMazoRobo() {
        return mazoRobo;
    }

    public void setMazoRobo(MazoRobo mazoRobo) {
        this.mazoRobo = mazoRobo;
    }

    public MazoDescarte getMazoDescarte() {
        return mazoDescarte;
    }

    public void setMazoDescarte(MazoDescarte mazoDescarte) {
        this.mazoDescarte = mazoDescarte;
    }

    public Turno getTurnoActual() {
        return turnoActual;
    }

    public void setTurnoActual(Turno turnoActual) {
        this.turnoActual = turnoActual;
    }

    public Color getColorActivo() {
        return colorActivo;
    }

    public void setColorActivo(Color colorActivo) {
        this.colorActivo = colorActivo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public EstadoSala getEstadoSala() {
        return estadoSala;
    }

    public void setEstadoSala(EstadoSala estadoSala) {
        this.estadoSala = estadoSala;
    }

    @Override
    public String toString() {
        return "Partida{" + "estado=" + estado + ", direccion=" + direccion + ", mazoRobo=" + mazoRobo + ", mazoDescarte=" + mazoDescarte + ", turnoActual=" + turnoActual + ", colorActivo=" + colorActivo + ", jugadores=" + jugadores + ", estadoSala=" + estadoSala + '}';
    }

    
    
    
}
