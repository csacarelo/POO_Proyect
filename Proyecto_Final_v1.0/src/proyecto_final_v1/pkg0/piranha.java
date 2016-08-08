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

public class piranha extends Atacante {

    private ImageView im;
    
    public piranha(){
        Image image = new Image("file:D:\\Espol\\Actual\\VIIII\\Poo\\2Parcial\\Tarea\\POO_Proyect\\Proyecto_Final_v1.0\\piranha.png");
         im = new ImageView();
         im.setImage(image);
         im.setFitWidth(75);
         im.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im.setLayoutX(750);
         im.setLayoutY(500);
         mover(im);
    }
    
    @Override
    public void destruir() {}

    @Override
    public void mover(ImageView im) {
    TranslateTransition tt = new TranslateTransition(Duration.millis(15000), im);
         //Duration tiempo en que se translada
        tt.setByX(-500f); //Para que se mueva de un lado a otro
        tt.setByY(-100f);
        tt.setByZ(250f);
        tt.setCycleCount(40);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
    }

    @Override
    public void fila() {}

    public ImageView getIm() {
        return im;
    }

    public void setIm(ImageView im) {
        this.im = im;
    }
    
}

