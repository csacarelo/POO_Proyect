/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

/**
 *
 * @author gabri
 */

public class piranha extends Atacante {

    private ImageView im;
    private ImageView im2;
    private Label word;
    private int n ;
    private int n1;
    
    public piranha(){
       
        n =(int)(Math.random()*4+1); //indica la posibilidad del nivel a salir;    
        Image image = new Image("file:piranha.png");
         im = new ImageView();
         im.setImage(image);
         im.setFitWidth(75);
         im.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im.setLayoutX(950);
         im.setLayoutY(fila());
         
        Image image2 = new Image("file:red.png");
         im2 = new ImageView();
         im2.setImage(image2);
         im2.setFitWidth(40);
         im2.setFitHeight(42);
         im2.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im2.setLayoutX(955);
         im2.setLayoutY(fila()+51);
          
         
        word = new Label("a");
        word.setLayoutX(968);
        word.setLayoutY(fila()+42);
        word.setTextFill(Color.WHITE);
        word.setFont(Font.font("Comic San MS", 18));
         
         mover(im);
    }
    
    @Override
    public void destruir() {}

    @Override
    public void mover(ImageView im) {
        
         if (fila()==0){ 
    TranslateTransition tt = new TranslateTransition(Duration.millis(15000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(250f);
        tt.setByZ(250f);
        tt.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
        TranslateTransition w = new TranslateTransition(Duration.millis(15000), piranha.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByY(250f);
        w.setByZ(250f);
        w.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(15000), piranha.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByY(250f);
        m2.setByZ(250f);
        m2.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
         }
         else if (fila()==150){ 
    TranslateTransition tt = new TranslateTransition(Duration.millis(15000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        //tt.setByY(-300f);
        tt.setByZ(250f);
        tt.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
        TranslateTransition w = new TranslateTransition(Duration.millis(15000), piranha.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        //w.setByY(-300f);
        w.setByZ(250f);
        w.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(15000), piranha.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        //m2.setByY(-300f);
        m2.setByZ(250f);
        m2.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
         }
         
         else if (fila()==350){ 
    TranslateTransition tt = new TranslateTransition(Duration.millis(15000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(-175f);
        tt.setByZ(250f);
        tt.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
        TranslateTransition w = new TranslateTransition(Duration.millis(15000), piranha.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByY(-175f);
        w.setByZ(250f);
        w.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(15000), piranha.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByY(-175f);
        m2.setByZ(250f);
        m2.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
         }
         
         else if (fila()==500){ 
    TranslateTransition tt = new TranslateTransition(Duration.millis(15000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(-300f);
        tt.setByZ(250f);
        tt.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
        TranslateTransition w = new TranslateTransition(Duration.millis(15000), piranha.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByY(-300f);
        w.setByZ(250f);
        w.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(15000), piranha.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByY(-300f);
        m2.setByZ(250f);
        m2.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
         }
 
    }
    
     @Override
    public int fila() {
       
       if (n==1){
            n1=0;
        } else if (n==2){
            n1=150;
        } else if (n==3){
            n1=350;
        } else if (n==4){
            n1=500;
        }  
           
       return n1;  
    }
    
    public ImageView getIm() {
        return im;
    }

    public void setIm(ImageView im) {
        this.im = im;
    }

    public Label getWord() {
        return word;
    }

    public void setWord(Label word) {
        this.word = word;
    }

    public ImageView getIm2() {
        return im2;
    }

    public void setIm2(ImageView im2) {
        this.im2 = im2;
    }
}

