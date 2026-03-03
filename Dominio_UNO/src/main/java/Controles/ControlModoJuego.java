/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controles;

import Vistas.ModoJuego;
import entities.Jugador;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ControlModoJuego {
    
    private ControlPantalla controlPantalla;
    private ModoJuego modoJuego;
    private ControlJugador controlJugador;
    
    public ControlModoJuego() {
        controlPantalla = new ControlPantalla();
        controlJugador = new ControlJugador();
        this.modoJuego= new ModoJuego();
        cargarDatos();
        controlPantalla.actualizarPantalla(modoJuego);
        
        modoJuego.listenerBtnCancelar(e -> mostrarMenuPrincipal());
        
        
    }
    public void mostrarMenuPrincipal(){
        controlPantalla.mostrarMenuPrincipal();
    }
    
    public void cargarDatos(){
        Jugador jugadorActual = controlJugador.obtenerJugador();
        modoJuego.labelNombreU.setText(jugadorActual.getNombre());
        modoJuego.labelAvatar.setText(jugadorActual.getAvatar());
    }

    
    
    

}
