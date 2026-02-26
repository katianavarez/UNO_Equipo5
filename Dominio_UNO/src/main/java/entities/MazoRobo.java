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
public class MazoRobo {
    private int cantidadCartas;
    private Stack<Carta> cartas;

    public MazoRobo() {
    }

    public MazoRobo(int cantidadCartas, Stack<Carta> cartas) {
        this.cantidadCartas = cantidadCartas;
        this.cartas = cartas;
    }

    public int getCantidadCartas() {
        return cantidadCartas;
    }

    public void setCantidadCartas(int cantidadCartas) {
        this.cantidadCartas = cantidadCartas;
    }

    public Stack<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(Stack<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "MazoRobo{" + "cantidadCartas=" + cantidadCartas + ", cartas=" + cartas + '}';
    }

    
    
    
}
