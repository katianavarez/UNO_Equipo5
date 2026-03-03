/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controles;

import Vistas.MenuPrincipal;

/**
 *
 * @author $Luis Carlos Manjarrez Gonzalez
 */
public class ControlMenuPrincipal {
    private MenuPrincipal menuPrincipal;
    private ControlJugador controlJugador;
    private ControlPantalla controlPantalla;
    
    
    public ControlMenuPrincipal() {
        controlPantalla = new ControlPantalla();
        controlJugador = new ControlJugador();
        this.menuPrincipal = new MenuPrincipal();
        
        controlPantalla.actualizarPantalla(menuPrincipal);
        
        menuPrincipal.listenerBtnContinuar(e-> obtenerDatos());
    }
    
    public void obtenerDatos(){
        String nombre = menuPrincipal.campoUsuario.getText();
        System.out.println("Nombre U :  " + nombre);
        String avatar = menuPrincipal.getAvatarSeleccionado();
        System.out.println("avatar :  " + avatar);
        controlJugador.crearJugador(avatar, nombre);
        
        controlPantalla.mostrarModoJuego();
    }
    

}
