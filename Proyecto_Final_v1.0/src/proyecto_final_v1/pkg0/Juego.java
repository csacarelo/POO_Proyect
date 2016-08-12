/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Christian
 */
public class Juego {
    
    int puntaje;
    int vidas;
    int cargas;
    int nivel;
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

        
        Buceador b = new Buceador();
        
        _bu.getChildren().addAll(im2,b.getBu());
    
        PaneOrganizer2.actualizarVentana();
        PaneOrganizer2._root.getChildren().addAll(_bu);
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
