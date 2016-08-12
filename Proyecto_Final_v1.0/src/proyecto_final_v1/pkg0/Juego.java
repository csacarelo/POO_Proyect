/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import static proyecto_final_v1.pkg0.PaneOrganizer2._root;
import static proyecto_final_v1.pkg0.PaneOrganizer2.actualizarVentana;

/**
 *
 * @author Christian
 */
public class Juego {
    
    int puntaje;
    int vidas;
    int cargas;
    int nivel;
    boolean flag=false;
    ArchPalabras Arch;
    Thread Enemigo1;
    Thread Enemigo2;
    Thread Enemigo3;
    Thread Enemigo4;
    
    public Juego()
    {
        Arch=new ArchPalabras();
        puntaje=0;
        vidas=3;
        cargas=0;
        nivel=3;
        PaneOrganizer2._root= new Pane();
        Pane _bu = new Pane();
        Image image = new Image("file:oce.png");
        ImageView im2 = new ImageView();
        im2.setImage(image);
        im2.setFitWidth(1000);
        im2.setFitHeight(800);
      
        Button btn4 = new Button("REGRESAR");
         btn4.setLayoutX(89);
         btn4.setLayoutY(690);
        //btn4.setOnAction(new PaneOrganizer2.ClickHandler4());
         Label VIDAS = new Label("VIDAS:");
         VIDAS.setLayoutX(5);
         VIDAS.setLayoutY(5);
         Label PUNTAJE = new Label("PUNTAJE:");
         PUNTAJE.setLayoutX(5);
         PUNTAJE.setLayoutY(10);
         Label NIVEL = new Label("NIVEL:");
         NIVEL.setLayoutX(30);
         NIVEL.setLayoutY(730);
     
        
    
        VIDAS.setContentDisplay(ContentDisplay.CENTER);
        VIDAS.setFont(Font.font(null, FontWeight.BOLD, 12));
        
        btn4.setFont(Font.font(null, FontWeight.BOLD, 25));
        PUNTAJE.setFont(Font.font(null, FontWeight.BOLD, 12));
        PUNTAJE.setTextFill(Color.LIGHTSKYBLUE);
        NIVEL.setFont(Font.font(null, FontWeight.BOLD, 12));
        NIVEL.setTextFill(Color.LIGHTSKYBLUE);
        actualizarVentana(); 

        
        Buceador b = new Buceador();
        
        _bu.getChildren().addAll(im2,b.getBu());
    
        PaneOrganizer2.actualizarVentana();
        PaneOrganizer2._root.getChildren().addAll(_bu);
    }
    
    private class ClickHandler3 implements EventHandler<ActionEvent> {
         
           @Override
           public void handle(ActionEvent event){
               flag = true;
           }       
     }
    public void Jugar()
    {
        if(nivel==1)
        {
            Enemigo1=new Thread(new Accion(Arch,10));
            Enemigo1.start();
        }
        if(nivel==2)
        {
            Enemigo1=new Thread(new Accion(Arch,20));
            Enemigo2=new Thread(new Accion(Arch,20));
            Enemigo1.start();
            Enemigo2.start();
        }
        if(nivel==3)
        {
            Enemigo1=new Thread(new Accion(Arch,30));
            Enemigo2=new Thread(new Accion(Arch,30));
            Enemigo3=new Thread(new Accion(Arch,30));
            Enemigo1.start();
            Enemigo2.start();
            Enemigo3.start();
        }
        if(nivel==4)
        {
            Enemigo1=new Thread(new Accion(Arch,40));
            Enemigo2=new Thread(new Accion(Arch,40));
            Enemigo3=new Thread(new Accion(Arch,40));
            Enemigo4=new Thread(new Accion(Arch,40));
            Enemigo1.start();
            Enemigo2.start();
            Enemigo3.start();
            Enemigo4.start();
        }
        
        
            
    }
    
}
