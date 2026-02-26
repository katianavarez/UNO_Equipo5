/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.Color;
import enums.TipoCarta;
import enums.ValorCarta;

/**
 *
 * @author katia
 */
public class Carta {
    private Color color;
    private ValorCarta valor;
    private TipoCarta tipo;
    
    public Carta() {
    }
    
    public Carta(Color color, ValorCarta valor, TipoCarta tipo) {
        this.color = color;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ValorCarta getValor() {
        return valor;
    }
    
    public void setValor(ValorCarta valor) {
        this.valor = valor;
    }

    public TipoCarta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarta tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carta{" + "color=" + color + ", valor=" + valor + ", tipo=" + tipo + '}';
    }
    
    
}
