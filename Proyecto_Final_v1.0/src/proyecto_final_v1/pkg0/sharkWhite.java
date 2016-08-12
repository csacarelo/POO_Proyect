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
public class sharkWhite extends Atacante {

    private ImageView im;
    private ImageView im2;
    private Label word;
    private int n ;
    private int n1;
    
    
    public sharkWhite(){
        
    n =(int)(Math.random()*4+1); //indica la posibilidad del nivel a salir;    
    Image image = new Image("file:tiburon45.png");
         im = new ImageView();
         im.setImage(image);
         im.setFitWidth(300);
         im.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im.setLayoutX(750);
         im.setLayoutY(fila()); 
       
    Image image2 = new Image("file:blue.png");
         im2 = new ImageView();
         im2.setImage(image2);
         im2.setFitWidth(200);
         im2.setFitHeight(25);
         im2.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im2.setLayoutX(800);
         im2.setLayoutY(fila()+132);
          
         
        word = new Label("white");
        word.setLayoutX(815);
        word.setLayoutY(fila()+130);
        word.setTextFill(Color.WHITE);
        word.setFont(Font.font("Comic San MS", 20));
    
         mover(im);
       
    }
    
    @Override
    public void destruir() {
        int  n3 =(int)(Math.random()*1+1);
        
       // if ((n3==0)&&(im.getLayoutX()<300)){
       if(im.getLayoutX()<900){
           System.out.println(im.getLayoutX());
        //im.setOpacity(75);
        TranslateTransition tt = new TranslateTransition(Duration.millis(10000), im);
         //Duration tiempo en que se translada
        //tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByX(-800f);
        tt.setByZ(200f);
        //tt.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        //tt.setByY(100f);
        //tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
            
       // }else if ((n3==1)&&(im.getLayoutX()<300)){
        /*else if (im.getLayoutX()<300){
        im.setOpacity(75);
        TranslateTransition tt = new TranslateTransition(Duration.millis(10000), im);
         //Duration tiempo en que se translada
        //tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(-800f);
        tt.setByZ(200f);
        //tt.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        //tt.setByY(100f);
        //tt.setAutoReverse(true); //ayuda que regrese
        tt.play();*/
        }
        
    }

    @Override
    public void mover(ImageView im) {
         
        if (fila()==0){ 
         TranslateTransition tt = new TranslateTransition(Duration.millis(10000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(-100f);
        tt.setByZ(200f);
        tt.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        tt.setByY(100f);
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
        //-------------Probando--------------------//revisar
        if (im.getLayoutX()<750){
           System.out.println(im.getLayoutX());
           System.out.println(tt.getByX());
            /* 
            tt.pause();
            tt.setByY(200);
            tt.play();*/
           tt.stop();
        }
        
        
        //-----------------------------------------
        
        
        TranslateTransition w = new TranslateTransition(Duration.millis(10000), sharkWhite.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByY(-100f);
        w.setByZ(200f);
        w.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        w.setByY(100f);
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(10000), sharkWhite.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByY(-100f);
        m2.setByZ(200f);
        m2.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        m2.setByY(100f);
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
        
        
        }
        
        else if (fila()==125){
        TranslateTransition tt = new TranslateTransition(Duration.millis(10000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByZ(200f);
        tt.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
      
          TranslateTransition w = new TranslateTransition(Duration.millis(10000), sharkWhite.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByZ(200f);
        w.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(10000), sharkWhite.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByZ(200f);
        m2.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
        }
        
        else if (fila()==250){
        TranslateTransition tt = new TranslateTransition(Duration.millis(10000), im);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByZ(200f);
        tt.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        tt.setByY(-150f);
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
        TranslateTransition w = new TranslateTransition(Duration.millis(10000), sharkWhite.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByY(-100f);
        w.setByZ(200f);
        w.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        w.setByY(-150f);
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(10000), sharkWhite.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByY(-100f);
        m2.setByZ(200f);
        m2.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        m2.setByY(-150f);
        m2.setAutoReverse(true); //ayuda que regrese
        m2.play();
      
        }
        
         else if (fila()==500){
       TranslateTransition tt = new TranslateTransition(Duration.millis(10000), sharkWhite.this.im);
         //Duration tiempo en que se translada
         
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByZ(200f);
        tt.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        tt.setByY(-400f);
        tt.setAutoReverse(true); //ayuda que regrese
        tt.play();
        
        
        TranslateTransition w = new TranslateTransition(Duration.millis(10000), sharkWhite.this.word);
        w.setByX(-600f); //Para que se mueva de un lado a otro
        w.setByY(-100f);
        w.setByZ(200f);
        w.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        w.setByY(-400f);
        w.setAutoReverse(true); //ayuda que regrese
        w.play();
        
        TranslateTransition m2 = new TranslateTransition(Duration.millis(10000), sharkWhite.this.im2);
        m2.setByX(-600f); //Para que se mueva de un lado a otro
        m2.setByY(-100f);
        m2.setByZ(200f);
        m2.setCycleCount(Timeline.INDEFINITE);// Nos permite continuar el ciclo 
        m2.setByY(-400f);
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
