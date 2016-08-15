/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author gabri
 */
public abstract class Atacante {
    
   private int postIn;
    private int postFin;
    private int velocidad;
    protected int ID;
    protected ImageView im;
    protected ImageView im2;
    protected Label word;
    protected Label word2;
    protected Pane A;
    protected boolean murio;
   // private ImageView im2;
    
    public Atacante(){}
    
    abstract public void destruir();
    abstract public void mover(ImageView im);
    abstract public int fila();
    
    abstract public ImageView getIm2();
    abstract public Label getWord();

    public boolean isMurio() {
        return murio;
    }
    
    public void cambiarPalabra()
    {
        word.setVisible(false);
        word2.setVisible(true);
    }
    
    public int getID()
    {
        return this.ID;
    }

    public Pane getA() {
        return A;
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

    public Label getWord2() {
        return word2;
    }
    
    

    
    
}
