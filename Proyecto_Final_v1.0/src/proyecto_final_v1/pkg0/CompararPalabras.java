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
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Christian
 */
public class CompararPalabras extends Thread {
    Scanner scane=new Scanner(System.in);
    boolean flag=true;
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
            String ga=ke.getText();
            System.out.println("Key Pressed: " + ga);
            }
            
        });
        
    }
    public void destruir()
    {
        flag=false;
    }
    
  
}