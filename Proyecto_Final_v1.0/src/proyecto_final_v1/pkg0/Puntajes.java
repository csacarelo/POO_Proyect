/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import java.io.IOException;

/**
 *
 * @author Christian
 */
public class Puntajes implements Comparable<Puntajes> {
    
    private String nombre;
    private int puntuacion;
    
    public Puntajes(String i, int a)
    {
        this.nombre=i;
        this.puntuacion=a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
    
    
    @Override
    public int compareTo(Puntajes t) {
        if (this.puntuacion < t.getPuntuacion()) {
            return -1;
        }
        if (this.puntuacion > t.getPuntuacion()) {
            return 1;
        }
        return 0;
    }
    
}
