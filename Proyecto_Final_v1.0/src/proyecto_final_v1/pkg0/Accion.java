/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.application.Platform;
import javafx.scene.layout.Pane;

/**
 *
 * @author Christian
 */
public class Accion implements Runnable{
    
    Atacante A;
    int Velocidad;
    
    public Accion (ArchPalabras arch,int Rapidez)
    {
        int valorRandom=(int)(Math.random()*3)+1;
        Velocidad=Rapidez;
        switch(valorRandom)
        {
            case 1:
                //A=new piranha(arch.conseguirCaracterAleatoria(),Rapidez);
            case 2:
                //A=new sharkBlack(arch.conseguirPalabraAleatoria(),Rapidez);
            default:
                //A=new sharkWhite(arch.conseguirPalabraAleatoria(),Rapidez);
        }
        
                    
    }
    
    
    @Override
    public void run() {
        
        Platform.runLater(new Runnable() {
            @Override
                public void run(){
                    Pane a=new Pane();
                    a.getChildren().add(A.getIm());
                    PaneOrganizer2._root.getChildren().add(a);
                }
        });
        
        while (true)
        {
            
        }
    }

    
}
