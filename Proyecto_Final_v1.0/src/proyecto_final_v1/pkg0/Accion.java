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
    String palabraDeLaImagen;
    
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
                A=new sharkBlack(arch.conseguirPalabraAleatoria(),arch.conseguirPalabraAleatoria(),Rapidez);
                break;
            default:
                A=new sharkWhite(arch.conseguirPalabraAleatoria(),Rapidez);
                //A=new sharkBlack(arch.conseguirPalabraAleatoria(),Rapidez);
                break;
        }
        
                    
    }
    
    
    @Override
    public void run() {
        
        palabraDeLaImagen=A.getWord().getText();
        
        Platform.runLater(new Runnable() {
            @Override
                public void run(){
                    Pane a=new Pane();
                    a.getChildren().addAll(A.getA());
                    PaneOrganizer2._root.getChildren().add(a);
                    
                }
        });
        
        while (flagAlive && A.isFlagAcabo())
        {

            try
            {
                if(Character.toString(palabraDeLaImagen.charAt(0)).compareToIgnoreCase(CompararPalabras.ga)==0)
                {
                   palabraDeLaImagen=palabraDeLaImagen.substring(1);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run(){
                            
                           if(A.getID()!=3 || A.murio)
                                A.word.setText(palabraDeLaImagen);
                           else
                               A.word2.setText(palabraDeLaImagen);
                        }
                    });
                   
                   //A.getWord().setText(palabraDeLaImagen);
                }
            }catch(StringIndexOutOfBoundsException e)
            {
                if(A.getID()!=3)
                {
                    Juego.puntaje=Juego.puntaje+A.ID*10;
                    Juego.puntajeReal=Juego.puntajeReal+A.ID*10;
                    Juego.cambiarDeNivel();
                    destruir();
                    Juego.actualizarValores();
                }else if(A.murio)
                {
                    A.cambiarPalabra();
                    palabraDeLaImagen=A.getWord2().getText();
                    A.murio=false;
                }else{
                    Juego.puntaje=Juego.puntaje+A.ID*10;
                    Juego.puntajeReal=Juego.puntajeReal+A.ID*10;
                    Juego.cambiarDeNivel();
                    destruir();
                    Juego.actualizarValores();
                }
                    

            }
            
            
        }
    }
    
    public void destruir()
    {
        flagAlive=false;
        A.destruir();
    }

    
}
