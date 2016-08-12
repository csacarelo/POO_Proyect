/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.scene.control.Button;
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
        nivel=1;
        PaneOrganizer2._root= new Pane();
        Pane _bu = new Pane();

        
        Buceador b = new Buceador();
        
        _bu.getChildren().add(b.getBu());
    
        PaneOrganizer2.actualizarVentana();
        PaneOrganizer2._root.getChildren().addAll(_bu);
    }
    
    public void Jugar()
    {
        if(nivel==1)
        {
            //Enemigo1=new
        }
    }
    
}
