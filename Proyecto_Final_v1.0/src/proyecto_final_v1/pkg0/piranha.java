/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

/**
 *
 * @author gabri
 */

public class piranha extends Atacante {


    private int n ;
    private int n1;
    private String palabra;
    private int velocidad;
    TranslateTransition tt;

    
    
    public piranha(String palabra, int velocidad){
    this.palabra = palabra;
    this.velocidad = velocidad;
    this.ID=1;
    this.flagAcabo=true;
    this.A=new Pane();
    
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
         
        
        word = new Label(palabra); 
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
        tt.stop();
        flagAcabo=false;

        
    }

    @Override
    public void mover(ImageView im) {
     
        this.A.getChildren().addAll(im,piranha.this.im2,piranha.this.word);
        tt = new TranslateTransition(Duration.millis(this.velocidad*1000),this.A);
        
         if (fila()==0){ 
        
         //Duration tiempo en que se translada
        tt.setByX(-800f); //Para que se mueva de un lado a otro
        tt.setByY(250f);
        tt.setByZ(250f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        //tt.setAutoReverse(true); //ayuda que regrese

         }
         else if (fila()==150){ 
         //Duration tiempo en que se translada
        tt.setByX(-800f); //Para que se mueva de un lado a otro
        tt.setByZ(250f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        //tt.setAutoReverse(true); //ayuda que regrese
         
         }
         
         else if (fila()==350){ 
         //Duration tiempo en que se translada
        tt.setByX(-800f); //Para que se mueva de un lado a otro
        tt.setByY(-175f);
        tt.setByZ(250f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        //tt.setAutoReverse(true); //ayuda que regrese

         }
         
         else if (fila()==500){ 
         //Duration tiempo en que se translada
        tt.setByX(-800f); //Para que se mueva de un lado a otro
        tt.setByY(-300f);
        tt.setByZ(250f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        //tt.setAutoReverse(true); //ayuda que regrese     

         }
        tt.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              piranha.this.destruir();
              Juego.vidasPrianha--;
              Juego.actualizarValores();
              Juego.flagMurio=true;
             }
        });
        tt.play();
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

