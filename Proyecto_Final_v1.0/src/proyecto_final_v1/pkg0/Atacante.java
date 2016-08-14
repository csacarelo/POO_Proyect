/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 *
 * @author gabri
 */
public abstract class Atacante {
    
   private int postIn;
    private int postFin;
    private int velocidad;
    protected int ID;
    private ImageView im;
   // private ImageView im2;
    
    public Atacante(){}
    
    abstract public void destruir();
    abstract public void mover(ImageView im);
    abstract public int fila();
    
    abstract public ImageView getIm2();
    abstract public Label getWord();
    public int getID()
    {
        return this.ID;
    }
    public int getPostIn() {
        return postIn;
    }

    public void setPostIn(int postIn) {
        this.postIn = postIn;
    }

    public int getPostFin() {
        return postFin;
    }

    public void setPostFin(int postFin) {
        this.postFin = postFin;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public ImageView getIm() {
        return im;
    }

    public void setIm(ImageView im) {
        this.im = im;
    }

    
    
}
