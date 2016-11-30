/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figures.model;

/**
 *
 * @author Sonia
 */
public class Cercle extends Figura {
    private float radi;
    
    
    public Cercle(String nombre, float Area, float Perimetre) {
        super(nombre, Area, Perimetre);
    }

    public float getRadi() {
        return radi;
    }
    
    //TODO metode control.calculaArea();
    //TODO metode control.calcularPerimetre();
    //TODO metode control.demanarRadi();
    
}
