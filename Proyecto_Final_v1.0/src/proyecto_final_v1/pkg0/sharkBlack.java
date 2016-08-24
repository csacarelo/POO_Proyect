package proyecto_final_v1.pkg0;

import javafx.animation.Timeline;
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
 * @author Christian, Tatiana, Gabriel
 * @version 1.0 05 de Agosto de 2016
 */

public class sharkBlack extends Atacante {


    private int n ;
    private int n1;
    private String palabra;
    private int velocidad;
    
    TranslateTransition tt;

    
    /**
    * Constructor de clase sharBlack la cual hereda de la clase Abtracta Atacante.   
    * @param palabra String que es la palara 1 asignada a un tiburon negro.
    * @param palabra2 String que es la palara 2 asignada a un tiburon negro.
    * @param velocidad int que es la velocidad del tiburon negro.
    */
    public sharkBlack(String palabra, String palabra2, int velocidad){
    this.palabra = palabra;
    this.velocidad = velocidad;
    this.ID=3;
    this.murio=true;
    this.flagAcabo=true;
    this.A=new Pane();
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
        
        word2 = new Label(palabra2); 
        word2.setLayoutX(815);
        word2.setLayoutY(fila()+200);
        word2.setTextFill(Color.WHITE);
        word2.setFont(Font.font("Comic San MS", 20));
         
         mover(im);
   
    }
    
    
    /**
    * Constructor de clase sharBlack la cual hereda de la clase Abtracta Atacante.
    * Se hace que la imagen se mantenga equilibrada en una escala correcta.
    * @param palabra String que es la palara 1 asignada a un tiburon negro.
     * @param velocidad int que es la velocidad del tiburon negro.
    */
    public sharkBlack(String palabra, int velocidad){
    this.palabra = palabra;
    this.velocidad = velocidad;
    this.ID=3;
    this.flagAcabo=true;
    this.A=new Pane();
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
    
    
    /**
    * Constructor de clase sharBlack la cual hereda de la clase Abtracta Atacante.
    * Se hace que la imagen se mantenga equilibrada en una escala correcta.
    */
    public sharkBlack(){
        this.A=new Pane();
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
    
    
    /**
    * Metodo destruir void que hace que tanto el tiburon negro como sus palabras 
    * ya no sean visibles.
    */
    @Override
    public void destruir() {
        sharkBlack.this.im.setVisible(false);
        sharkBlack.this.word.setVisible(false);
        sharkBlack.this.im2.setVisible(false);
        sharkBlack.this.word2.setVisible(false);
        tt.stop();
        flagAcabo=false;
      
    }

    
     /**
    * Metodo mover void que hace que sea posible el movimiento del tiburon negro.
    */
    @Override
    public void mover(ImageView im) {
        
        
        this.A.getChildren().addAll(im,sharkBlack.this.im2,sharkBlack.this.word, sharkBlack.this.word2);
        sharkBlack.this.word2.setVisible(false);
        tt = new TranslateTransition(Duration.millis(this.velocidad*1000),this.A);
        
         if (fila()==0){ 
         
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(75f);
        tt.setByZ(200f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
       // tt.setAutoReverse(true); //ayuda que regrese     
         
        }
         else  if (fila()==125){ 
        tt = new TranslateTransition(Duration.millis(this.velocidad*1000), this.A);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByZ(200f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        //tt.setAutoReverse(true); //ayuda que regrese
       
        }
         else  if (fila()==250){ 
        tt = new TranslateTransition(Duration.millis(this.velocidad*1000), this.A);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(-100f);
        tt.setByZ(200f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        //tt.setAutoReverse(true); //ayuda que regrese
         
        }
         else  if (fila()==500){ 
        tt = new TranslateTransition(Duration.millis(this.velocidad*1000), this.A);
         //Duration tiempo en que se translada
        tt.setByX(-600f); //Para que se mueva de un lado a otro
        tt.setByY(-300f);
        tt.setByZ(200f);
        tt.setCycleCount(1);// Nos permite continuar el ciclo 
        //tt.setAutoReverse(true); //ayuda que regrese

        }
        tt.setOnFinished(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
              sharkBlack.this.destruir();
              Juego.vidas--;
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

    public Label getWord2() {
        return word2;
    }


    
    public void setWord(Label word) {
        this.word = word;
    }

}
