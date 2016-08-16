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
    

    
    
    //--------------------------------------------------------------------

    public ImageView getBu() {
        return bu;
    }

    public void setBu(ImageView bu) {
        this.bu = bu;
    }

}
