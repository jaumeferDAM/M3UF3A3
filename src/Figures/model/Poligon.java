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
public class Poligon extends Figura{
    
    private int nombreCostats;
    
    public Poligon(String nombre, float Area, float Perimetre) {
        super(nombre, Area, Perimetre);
    }

    public int getNombreCostats() {
        return nombreCostats;
    }
    
   //TODO metode control.demanarCostats(); 
}
