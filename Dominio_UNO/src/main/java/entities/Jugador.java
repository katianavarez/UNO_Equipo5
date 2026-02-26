/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.Rol;

/**
 *
 * @author katia
 */
public class Jugador {
    private String nombre;
    private String avatar;
    private Rol rol;
    private boolean estadoListo;
    private boolean presionoUno;
    private Mano mano;

    public Jugador() {
    }

    public Jugador(String nombre, String avatar, Rol rol, boolean estadoListo, boolean presionoUno, Mano mano) {
        this.nombre = nombre;
        this.avatar = avatar;
        this.rol = rol;
        this.estadoListo = estadoListo;
        this.presionoUno = presionoUno;
        this.mano = mano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean isEstadoListo() {
        return estadoListo;
    }

    public void setEstadoListo(boolean estadoListo) {
        this.estadoListo = estadoListo;
    }

    public boolean isPresionoUno() {
        return presionoUno;
    }

    public void setPresionoUno(boolean presionoUno) {
        this.presionoUno = presionoUno;
    }

    public Mano getMano() {
        return mano;
    }

    public void setMano(Mano mano) {
        this.mano = mano;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", avatar=" + avatar + ", rol=" + rol + ", estadoListo=" + estadoListo + ", presionoUno=" + presionoUno + ", mano=" + mano + '}';
    }

    
    
}
