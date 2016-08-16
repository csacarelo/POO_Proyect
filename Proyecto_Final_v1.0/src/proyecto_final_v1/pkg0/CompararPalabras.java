/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Christian
 */
public class CompararPalabras extends Thread {
    Scanner scane=new Scanner(System.in);
    boolean flag=true;
    public static String ga="";
    public static KeyCode a;
    public CompararPalabras()
    {
        
    }
    
    @Override
    public void run()
    {
        result();
       while (flag) 
       {

       }
    }
        
    private void result(){
        PaneOrganizer2._root.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent ke) {
            ga=ke.getText();
            a=ke.getCode();
            if(ke.getCode().compareTo(KeyCode.ENTER)==0 && Juego.puntaje>=200)
            {
                Juego.cerrarHilos();
                Juego.puntaje=Juego.puntaje-200;
                Juego.cambiarDeNivel();
                Juego.actualizarValores();
            }
                
            System.out.println("Key Pressed: " + ga);
            }
            
        });
        
    }
    public void destruir()
    {
        flag=false;
    }
    
  
}
