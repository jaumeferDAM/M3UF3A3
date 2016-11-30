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
public abstract class Figura {
    private String nombre;
    private float Area;
    private float Perimetre;

    public Figura(String nombre, float Area, float Perimetre) {
        this.nombre = nombre;
        this.Area = Area;
        this.Perimetre = Perimetre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setArea(float Area) {
        this.Area = Area;
    }

    public void setPerimetre(float Perimetre) {
        this.Perimetre = Perimetre;
    }
    
    
    
    
    
}
