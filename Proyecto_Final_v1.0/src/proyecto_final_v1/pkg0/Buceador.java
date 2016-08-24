package proyecto_final_v1.pkg0;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author Christian, Tatiana, Gabriel
 * @version 1.0 05 de Agosto de 2016
 */

public class Buceador {
   
     private ImageView bu;

     
     /**
    * Constructor de clase publica Buseador, que mosntrara en la ventana Juego
    * a un buso moviendose en el mar.
    */   
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
    
    
     /**
    * Metodo mover void que permitira ver como se mueve el buso.   
    * @param bu ImageView que es la imagen del buso para poder mostrarla.
    */    
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
    
    
    /**
    * Metodo getBu ImageView que permite obtener la imagen del buso.   
    * @return bu una imagen que representa al buso.
    */
    public ImageView getBu() {
        return bu;
    }

    public void setBu(ImageView bu) {
        this.bu = bu;
    }

}
