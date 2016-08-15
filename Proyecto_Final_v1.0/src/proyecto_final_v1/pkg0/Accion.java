/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.layout.Pane;

/**
 *
 * @author Christian
 */
public class Accion extends Thread{
    
    Atacante A;
    int Velocidad;
    boolean flagAlive=true;
    
    public Accion (ArchPalabras arch,int Rapidez)
    {
        int valorRandom=(int)(Math.random()*3+1);
        Velocidad=Rapidez;
        switch(valorRandom)
        {
            case 1:
                A=new piranha(arch.conseguirCaracterAleatoria(),Rapidez);
                break;
            case 2:
                A=new sharkBlack(arch.conseguirPalabraAleatoria(),Rapidez);
                break;
            default:
                A=new sharkWhite(arch.conseguirPalabraAleatoria(),Rapidez);
                //A=new sharkBlack(arch.conseguirPalabraAleatoria(),Rapidez);
                break;
        }
        
                    
    }
    
    
    @Override
    public void run() {
        
        String palabraDeLaImagen=A.getWord().getText();
        
        Platform.runLater(new Runnable() {
            @Override
                public void run(){
                    Pane a=new Pane();
                    a.getChildren().addAll(A.getA());
                    PaneOrganizer2._root.getChildren().add(a);
                    
                }
        });
        
        while (flagAlive)
        {

            try
            {
                if(Character.toString(palabraDeLaImagen.charAt(0)).compareToIgnoreCase(CompararPalabras.ga)==0)
                {
                   palabraDeLaImagen=palabraDeLaImagen.substring(1);
                   //A.getWord().setText(palabraDeLaImagen);
                }
            }catch(StringIndexOutOfBoundsException e)
            {
                Juego.puntaje=Juego.puntaje+A.ID*10;
                Juego.cambiarDeNivel();
                destruir();
                Juego.actualizarValores();
            }
            
            
        }
    }
    
    public void destruir()
    {
        flagAlive=false;
        A.destruir();
    }

    
}
