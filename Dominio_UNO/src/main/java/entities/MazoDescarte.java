/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Stack;

/**
 *
 * @author katia
 */
public class MazoDescarte {
    private Stack<Carta> cartas;
    private Carta cartaActiva;

    public MazoDescarte() {
    }

    public MazoDescarte(Stack<Carta> cartas, Carta cartaActiva) {
        this.cartas = cartas;
        this.cartaActiva = cartaActiva;
    }

    public Stack<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(Stack<Carta> cartas) {
        this.cartas = cartas;
    }

    public Carta getCartaActiva() {
        return cartaActiva;
    }

    public void setCartaActiva(Carta cartaActiva) {
        this.cartaActiva = cartaActiva;
    }

    @Override
    public String toString() {
        return "MazoDescarte{" + "cartas=" + cartas + ", cartaActiva=" + cartaActiva + '}';
    }
    
    
}
