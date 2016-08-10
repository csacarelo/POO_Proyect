/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author gabri
 */
public class Buceador {
   
     private ImageView bu;
     private int vidas;
     private int daños;
     private int ataqueEspecial;
     private int score;
     
    public Buceador(){
       Image image = new Image("file:buceador.png");
         bu = new ImageView();
         bu.setImage(image);
         bu.setFitWidth(250);
         bu.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         bu.setLayoutX(0);
         bu.setLayoutY(100);
         mover(bu);
    }
    
    private void mover(ImageView bu){
           TranslateTransition tt = new TranslateTransition(Duration.millis(5000), bu);
         //Duration tiempo en que se translada
        //tt.setByX(-500f); //Para que se mueva de un lado a otro
        tt.setByY(-75f);
        tt.setByZ(200f);
        tt.setCycleCount(40);// Nos permite continuar el ciclo 
        tt.setByY(125f);
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
         
    }
    
    private void aumentarScore(int score){
        //Definir
    }
    
    private void aumentarVida(int vida){
        //Definir
    }
    
    private void disminuirVida(int vida){
        //Definir
    }
    
    private void aumentarAtaqueEspecial(){
        //Definir
    }
    
    private void disminuirAtaqueEspecial(){
        //Definir
    }
    
    
    //--------------------------------------------------------------------

    public ImageView getBu() {
        return bu;
    }

    public void setBu(ImageView bu) {
        this.bu = bu;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getDaños() {
        return daños;
    }

    public void setDaños(int daños) {
        this.daños = daños;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
