/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controles;

import Vistas.FramePrincipal;
import Vistas.ModoJuego;
import entities.Jugador;
import javax.swing.JPanel;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ControlPantalla {
    
    private static FramePrincipal framePrincipal;
    private ModoJuego modoJuego;
    private Jugador jugadorModel;
    
    public ControlPantalla() {
        if(framePrincipal == null){
            framePrincipal = new FramePrincipal();
        }
        
    }
    public void actualizarPantalla(JPanel panel){
        framePrincipal.actualizarPantalla(panel);
    }
    
    public void mostrarMenuPrincipal(){
        ControlMenuPrincipal menuPrincipal = new ControlMenuPrincipal();
        
    }
    
    public void mostrarModoJuego(){
        ControlModoJuego modoJuego = new ControlModoJuego();
        
    }
    

}
