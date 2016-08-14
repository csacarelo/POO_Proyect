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

public class piranha extends Atacante {

    private ImageView im;
    private ImageView im2;
    private Label word;
    private int n ;
    private int n1;
    private String palabra;
    private int velocidad;
    
    
    public piranha(String palabra, int velocidad){
    this.palabra = palabra;
    this.velocidad = velocidad;
    
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
         im2.setFitWidth(50);
         im2.setFitHeight(50);
         im2.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im2.setLayoutX(955);
         im2.setLayoutY(fila()+51);
          
         
       
        ArchPalabras a = new ArchPalabras();
        
        word = new Label(a.conseguirCaracterAleatoria()); 
        word.setLayoutX(968);
        word.setLayoutY(fila()+43);
        word.setTextFill(Color.WHITE);
        word.setFont(Font.font("Comic San MS", 18));
         
         mover(im);
    }
    
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
         im2.setFitWidth(50);
         im2.setFitHeight(50);
         im2.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im2.setLayoutX(955);
         im2.setLayoutY(fila()+51);
          
        //Palabra
        
        ArchPalabras a = new ArchPalabras();
        
        word = new Label(a.conseguirCaracterAleatoria()); 
        word.setLayoutX(968);
        word.setLayoutY(fila()+43);
        word.setTextFill(Color.WHITE);
        word.setFont(Font.font("Comic San MS", 18));
         
         mover(im);
    }
    
    @Override
    public void destruir() {
        piranha.this.im.setVisible(false);
        piranha.this.word.setVisible(false);
        piranha.this.im2.setVisible(false);
        
        
    }

    @Override
    public void mover(ImageView im) {
        
         if (fila()==0){ 
    TranslateTransition tt = new TranslateTransition(Duration.millis(15000), im);
         //Duration tiempo en que se translada
        tt.setByX(-800f); //Para que se mueva de un lado a otro
        tt.setByY(250f);
        tt.setByZ(250f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
       
        tt.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.im.setVisible(false);
             }
        });
       
        
        TranslateTransition w = new TranslateTransition(Duration.millis(15000), piranha.this.word);
        w.setByX(-800f); //Para que se mueva de un lado a otro
        w.setByY(250f);
        w.setByZ(250f);
        w.setCycleCount(1);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        w.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.word.setVisible(false);
             }
        });
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(15000), piranha.this.im2);
        m2.setByX(-800f); //Para que se mueva de un lado a otro
        m2.setByY(250f);
        m2.setByZ(250f);
        m2.setCycleCount(1);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
        
        m2.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.im2.setVisible(false);
             }
        });
        
         }
         else if (fila()==150){ 
    TranslateTransition tt = new TranslateTransition(Duration.millis(15000), im);
         //Duration tiempo en que se translada
        tt.setByX(-800f); //Para que se mueva de un lado a otro
        tt.setByZ(250f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
        tt.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.im.setVisible(false);
             }
        });
        
        TranslateTransition w = new TranslateTransition(Duration.millis(15000), piranha.this.word);
        w.setByX(-800f); //Para que se mueva de un lado a otro
        w.setByZ(250f);
        w.setCycleCount(1);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        w.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.word.setVisible(false);
             }
        });
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(15000), piranha.this.im2);
        m2.setByX(-800f); //Para que se mueva de un lado a otro
        m2.setByZ(250f);
        m2.setCycleCount(1);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
         
        m2.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.im2.setVisible(false);
             }
        });
         }
         
         else if (fila()==350){ 
    TranslateTransition tt = new TranslateTransition(Duration.millis(15000), im);
         //Duration tiempo en que se translada
        tt.setByX(-800f); //Para que se mueva de un lado a otro
        tt.setByY(-175f);
        tt.setByZ(250f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
        tt.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.im.setVisible(false);
             }
        });
        
        TranslateTransition w = new TranslateTransition(Duration.millis(15000), piranha.this.word);
        w.setByX(-800f); //Para que se mueva de un lado a otro
        w.setByY(-175f);
        w.setByZ(250f);
        w.setCycleCount(1);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        w.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.word.setVisible(false);
             }
        });
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(15000), piranha.this.im2);
        m2.setByX(-800f); //Para que se mueva de un lado a otro
        m2.setByY(-175f);
        m2.setByZ(250f);
        m2.setCycleCount(1);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
        
        m2.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.im2.setVisible(false);
             }
        });
         }
         
         else if (fila()==500){ 
    TranslateTransition tt = new TranslateTransition(Duration.millis(15000), im);
         //Duration tiempo en que se translada
        tt.setByX(-800f); //Para que se mueva de un lado a otro
        tt.setByY(-300f);
        tt.setByZ(250f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
        tt.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.im.setVisible(false);
             }
        });
        
        TranslateTransition w = new TranslateTransition(Duration.millis(15000), piranha.this.word);
        w.setByX(-800f); //Para que se mueva de un lado a otro
        w.setByY(-300f);
        w.setByZ(250f);
        w.setCycleCount(1);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        w.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.word.setVisible(false);
             }
        });
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(15000), piranha.this.im2);
        m2.setByX(-800f); //Para que se mueva de un lado a otro
        m2.setByY(-300f);
        m2.setByZ(250f);
        m2.setCycleCount(1);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
         
         m2.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.im2.setVisible(false);
             }
        });
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

