/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controles;

import entities.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ControlJugador {
    private Jugador jugadorModel;
    private static List<Jugador> listaJugadores;

    public ControlJugador() {
        if(listaJugadores == null)listaJugadores = new ArrayList<>();
        
    }
    
    public void crearJugador(String avatar, String nombre){
        Jugador jugadorActual = new Jugador();
        jugadorActual.setNombre(nombre);
        jugadorActual.setAvatar(avatar);
        listaJugadores.add(jugadorActual);
        
    }
    public boolean verificarNombre(String nombre){
        for(Jugador j: listaJugadores){
            if(j.getNombre().equals(nombre)) return true;
        }
        System.out.println("Avatar disponible");
        return false;
    }
    // false si esta disponible el avatar
    public boolean verificarAvatar(String avatar){
        for(Jugador j: listaJugadores){
            if(j.getAvatar().equals(avatar)) return true;
        }
        System.out.println("Avatar disponible");
        return false;
    }
    
    public Jugador obtenerJugador(){
        return listaJugadores.getFirst();
    }
    
    

}
