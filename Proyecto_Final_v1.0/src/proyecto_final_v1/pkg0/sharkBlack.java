/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
public class sharkBlack extends Atacante {

    private ImageView im;
    private ImageView im2;
    private Label word;
    private int n ;
    private int n1;
    private String palabra;
    private int velocidad;
    TranslateTransition tt;
    TranslateTransition w;
    TranslateTransition m2;
    
    public sharkBlack(String palabra, int velocidad){
    this.palabra = palabra;
    this.velocidad = velocidad;
    this.ID=3;
        n =(int)(Math.random()*4+1); //indica la posibilidad del nivel a salir;    
                
        Image image = new Image("file:tiburonb.png");
         im = new ImageView();
         im.setImage(image);
         im.setFitWidth(300);
         im.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im.setLayoutX(750);
         im.setLayoutY(fila());
         
         Image image2 = new Image("file:brown.png");
         im2 = new ImageView();
         im2.setImage(image2);
         im2.setFitWidth(600);
         im2.setFitHeight(40);
         im2.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im2.setLayoutX(800);
         im2.setLayoutY(fila()+200);
          
        
        word = new Label(palabra); 
        word.setLayoutX(815);
        word.setLayoutY(fila()+200);
        word.setTextFill(Color.WHITE);
        word.setFont(Font.font("Comic San MS", 20));
         
         
         mover(im);
    
    
    }
    
    public sharkBlack(){
        
        n =(int)(Math.random()*4+1); //indica la posibilidad del nivel a salir;    
                
        Image image = new Image("file:tiburonb.png");
         im = new ImageView();
         im.setImage(image);
         im.setFitWidth(300);
         im.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im.setLayoutX(750);
         im.setLayoutY(fila());
         
         Image image2 = new Image("file:brown.png");
         im2 = new ImageView();
         im2.setImage(image2);
         im2.setFitWidth(600);
         im2.setFitHeight(40);
         im2.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im2.setLayoutX(800);
         im2.setLayoutY(fila()+200);
          
         
        ArchPalabras a = new ArchPalabras();
        
        word = new Label(a.conseguirPalabraAleatoria()); 
        word.setLayoutX(815);
        word.setLayoutY(fila()+200);
        word.setTextFill(Color.WHITE);
        word.setFont(Font.font("Comic San MS", 20));
         
         
         mover(im);
    }
    
    @Override
    public void destruir() {
        sharkBlack.this.im.setVisible(false);
        sharkBlack.this.word.setVisible(false);
        sharkBlack.this.im2.setVisible(false);
        tt.stop();
        w.stop();
        m2.stop();
        
        
    }

    @Override
    public void mover(ImageView im) {
        
         if (fila()==0){ 
         tt = new TranslateTransition(Duration.millis(5000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(75f);
        tt.setByZ(200f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
         tt.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              sharkBlack.this.destruir();
              Juego.vidas--;
              Juego.actualizarValores();
              Juego.flagMurio=true;
             }
        });
         
        w = new TranslateTransition(Duration.millis(5000), sharkBlack.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByY(75f);
        w.setByZ(200f);
        w.setCycleCount(1);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        m2 = new TranslateTransition(Duration.millis(5000), sharkBlack.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByY(75f);
        m2.setByZ(200f);
        m2.setCycleCount(1);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
        
         
    }
         else  if (fila()==125){ 
        tt = new TranslateTransition(Duration.millis(5000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByZ(200f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
         tt.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              sharkBlack.this.destruir();
              Juego.vidas--;
              Juego.actualizarValores();
              Juego.flagMurio=true;
             }
        });
         
        w = new TranslateTransition(Duration.millis(5000), sharkBlack.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByZ(200f);
        w.setCycleCount(1);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        

        
        m2 = new TranslateTransition(Duration.millis(5000), sharkBlack.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByZ(200f);
        m2.setCycleCount(1);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
        

         
    }
         else  if (fila()==250){ 
        tt = new TranslateTransition(Duration.millis(5000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(-100f);
        tt.setByZ(200f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
         
         tt.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              sharkBlack.this.destruir();
              Juego.vidas--;
              Juego.actualizarValores();
              Juego.flagMurio=true;
             }
        });
         
        w = new TranslateTransition(Duration.millis(5000), sharkBlack.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByY(-100f);
        w.setByZ(200f);
        w.setCycleCount(1);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
         
        m2 = new TranslateTransition(Duration.millis(5000), sharkBlack.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByY(-100f);
        m2.setByZ(200f);
        m2.setCycleCount(1);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
        
         
    }
         else  if (fila()==500){ 
        tt = new TranslateTransition(Duration.millis(5000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(-300f);
        tt.setByZ(200f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
         tt.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              sharkBlack.this.destruir();
              Juego.vidas--;
              Juego.actualizarValores();
              Juego.flagMurio=true;
             }
        });
         
        w = new TranslateTransition(Duration.millis(5000), sharkBlack.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByY(-300f);
        w.setByZ(200f);
        w.setCycleCount(1);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        
        m2 = new TranslateTransition(Duration.millis(5000), sharkBlack.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByY(-300f);
        m2.setByZ(200f);
        m2.setCycleCount(1);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
        

    }
    }    
     
    @Override
    public int fila() {
        
       if (n==1){
            n1=0;
        } else if (n==2){
            n1=125;
        } else if (n==3){
            n1=250;
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

    public ImageView getIm2() {
        return im2;
    }

    public void setIm2(ImageView im2) {
        this.im2 = im2;
    }

    public Label getWord() {
        return word;
    }

    public void setWord(Label word) {
        this.word = word;
    }

}
